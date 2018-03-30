// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.RangeChangeEvent;
import org.apache.myfaces.trinidad.event.RangeChangeListener;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.ModelUtils;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * UIXSelectRange is a base abstraction for 
 *           components that select a
 *           range, e.g, 5 - 10 of 50.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.RangeChangeEvent</code></td>
 * <td valign="top" nowrap>Any Phase<br>Invoke Application</td>
 * <td valign="top">The range change event is delivered when the user
                       navigates.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXSelectRange extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey VAR_KEY =
    TYPE.registerKey("var", String.class, PropertyKey.CAP_NOT_BOUND);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final PropertyKey RANGE_CHANGE_LISTENER_KEY =
    TYPE.registerKey("rangeChangeListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey ROWS_KEY =
    TYPE.registerKey("rows", Integer.class, Integer.valueOf(25));
  static public final PropertyKey FIRST_KEY =
    TYPE.registerKey("first", Integer.class, Integer.valueOf(0));
  static public final String RANGE_LABEL_FACET = "rangeLabel";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectRange";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.SelectRange";

  /**
   * Construct an instance of the UIXSelectRange.
   */
  public UIXSelectRange()
  {
    super("org.apache.myfaces.trinidad.ChoiceBar");
  }
  
  @Override
  public void encodeBegin(FacesContext context) throws IOException
  {
    _flushCachedDataModel();
    super.encodeBegin(context);
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    // Notify the specified RangeChanged listener method (if any)
    if (event instanceof RangeChangeEvent)
    {
      RangeChangeEvent gtEvent = (RangeChangeEvent)event;
      // update first when the event is delivered
      setFirst(gtEvent.getNewStart());

      broadcastToMethodBinding(event, getRangeChangeListener());
    }

    // Perform standard superclass processing
    super.broadcast(event);
  }
  
  /**
   * * We don't want to update model if we have validation errors
   * on the page, so if not immediate, queue the event in
   * INVOKE_APPLICATION phase.
   */
  @Override
  public void queueEvent(FacesEvent e)
  {
    if ((e instanceof RangeChangeEvent) && (e.getSource() == this))
    {
      if (isImmediate())
      {
        e.setPhaseId(PhaseId.ANY_PHASE);
      }
      else
      {
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
      }
    }

    super.queueEvent(e);
  }

  /**
   * Makes a row current.
   * @see CollectionModel#setRowIndex
   * @param rowIndex the zero-based row-index of the row that should be made
   * current. Use -1 to clear the current row.
   */
  public final void setRowIndex(int rowIndex)
  {
    _getDataModel().setRowIndex(rowIndex);
  }

  /**
   * @see CollectionModel#getRowIndex
   * @return the zero-based row-index of the current row, or -1
   *  if now row is current.
   */
  public final int getRowIndex()
  {
    return _getDataModel().getRowIndex();
  }

  /**
   * Gets the total number of rows in this table.
   * @see CollectionModel#getRowCount
   * @return -1 if the total number is not known.
   */
  public final int getRowCount()
  {
    return _getDataModel().getRowCount();
  }

  /**
  * Checks to see if the current row is available. This is useful when the
  * total number of rows is not known.
  * @see CollectionModel#isRowAvailable
  * @return true iff the current row is available.
  */
   public final boolean isRowAvailable()
   {
     return _getDataModel().isRowAvailable();
   }

  /**
  * Checks to see if the given row is available. This is useful when the
  * total number of rows is not known.
  * @see CollectionModel#isRowAvailable(int)
  * @param rowIndex identifies the row to check
  * @return true iff the current row is available.
  */
   public final boolean isRowAvailable(int rowIndex)
   {
     return _getDataModel().isRowAvailable(rowIndex);
   }

  /**
   * Gets the data for the current row.
   * @see CollectionModel#getRowData
   * @return null if the current row is unavailable
   */
  public final Object getRowData()
  {
    CollectionModel model = _getDataModel();
    // we need to call isRowAvailable() here because the 1.0 sun RI was
    // throwing exceptions when getRowData() was called with rowIndex=-1
    return model.isRowAvailable() ? model.getRowData() : null;
  }

  /**
   * Gets the data for the current row.
   * @param rowIndex identifies the row to get data from
   * @see CollectionModel#getRowData(int)
   * @return null if the current row is unavailable
   */
  public final Object getRowData(int rowIndex)
  {
    CollectionModel model = _getDataModel();
    // we need to call isRowAvailable() here because the 1.0 sun RI was
    // throwing exceptions when getRowData() was called with rowIndex=-1
    return model.isRowAvailable(rowIndex) ? model.getRowData(rowIndex) : null;
  }

  private CollectionModel _getDataModel()
  {
    if (_dataModel == null)
    {
      Object value = getValue();

      _dataModel = ModelUtils.toCollectionModel(value);

    }

    return _dataModel;
  }

  //
  // Flush the cached data model, if needed
  //
  private void _flushCachedDataModel()
  {

     _dataModel = null;

  }

  private transient CollectionModel   _dataModel = null;

  /**
   * use to customize the label of each range selection.
   */
  final public UIComponent getRangeLabel()
  {
    return getFacet(RANGE_LABEL_FACET);
  }

  /**
   * use to customize the label of each range selection.
   */
  @SuppressWarnings("unchecked")
  final public void setRangeLabel(UIComponent rangeLabelFacet)
  {
    getFacets().put(RANGE_LABEL_FACET, rangeLabelFacet);
  }

  /**
   * Gets the name of the EL variable that provides access to the "start"
   *               and "end" variables that point to the start and end row in
   *               the each range from the data model. This can be used to customize
   *               the range text.
   *
   * @return  the new var value
   */
  final public String getVar()
  {
    return ComponentUtils.resolveString(getProperty(VAR_KEY));
  }

  /**
   * Sets the name of the EL variable that provides access to the "start"
   *               and "end" variables that point to the start and end row in
   *               the each range from the data model. This can be used to customize
   *               the range text.
   * 
   * @param var  the new var value
   */
  final public void setVar(String var)
  {
    setProperty(VAR_KEY, (var));
  }

  /**
   * Gets whether data validation 
   *           should be skipped when range change
   *           events are generated by this component.
   * 
   *           When immediate is false (the default), events will
   *           be delivered during the Invoke Application phase, which
   *           will trigger validation.  When set to true,  events
   *           will be executed during the Apply Request Values phase.
   *
   * @return  the new immediate value
   */
  final public boolean isImmediate()
  {
    return ComponentUtils.resolveBoolean(getProperty(IMMEDIATE_KEY), false);
  }

  /**
   * Sets whether data validation 
   *           should be skipped when range change
   *           events are generated by this component.
   * 
   *           When immediate is false (the default), events will
   *           be delivered during the Invoke Application phase, which
   *           will trigger validation.  When set to true,  events
   *           will be executed during the Apply Request Values phase.
   * 
   * @param immediate  the new immediate value
   */
  final public void setImmediate(boolean immediate)
  {
    setProperty(IMMEDIATE_KEY, immediate ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets a method reference to a rangeChange listener that
   *          will be called when a new range is selected.
   *
   * @return  the new rangeChangeListener value
   */
  final public MethodBinding getRangeChangeListener()
  {
    return (MethodBinding)getProperty(RANGE_CHANGE_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a rangeChange listener that
   *          will be called when a new range is selected.
   * 
   * @param rangeChangeListener  the new rangeChangeListener value
   */
  final public void setRangeChangeListener(MethodBinding rangeChangeListener)
  {
    setProperty(RANGE_CHANGE_LISTENER_KEY, (rangeChangeListener));
  }

  /**
   * Gets <html> the data model being used by this component.
   * The specific model class is
   *         <code>org.apache.myfaces.trinidad.model.CollectionModel</code>.
   * 
   *         You may also use other model instances, e.g.,  
   *         <code>java.util.List</code>  ,
   *         array, and  <code>javax.faces.model.DataModel</code>.
   *         This component will automatically convert the instance
   *         into a <code>CollectionModel</code>.</html>
   * <p>
   * This is a required property on the component.
   * </p>
   *
   * @return  the new value value
   */
  final public Object getValue()
  {
    return getProperty(VALUE_KEY);
  }

  /**
   * Sets <html> the data model being used by this component.
   * The specific model class is
   *         <code>org.apache.myfaces.trinidad.model.CollectionModel</code>.
   * 
   *         You may also use other model instances, e.g.,  
   *         <code>java.util.List</code>  ,
   *         array, and  <code>javax.faces.model.DataModel</code>.
   *         This component will automatically convert the instance
   *         into a <code>CollectionModel</code>.</html>
   * <p>
   * This is a required property on the component.
   * 
   * @param value  the new value value
   */
  final public void setValue(Object value)
  {
    setProperty(VALUE_KEY, (value));
  }

  /**
   * Gets the maximum number of rows to display in a single range of rows.
   * Some ranges might have fewer
   * than the number of rows specified by this attribute (eg: the last range
   * might have an insufficient number of rows).
   * To display all rows at once, set this attribute to 0.
   *
   * @return  the new rows value
   */
  final public int getRows()
  {
    return ComponentUtils.resolveInteger(getProperty(ROWS_KEY), 25);
  }

  /**
   * Sets the maximum number of rows to display in a single range of rows.
   * Some ranges might have fewer
   * than the number of rows specified by this attribute (eg: the last range
   * might have an insufficient number of rows).
   * To display all rows at once, set this attribute to 0.
   * 
   * @param rows  the new rows value
   */
  final public void setRows(int rows)
  {
    setProperty(ROWS_KEY, Integer.valueOf(rows));
  }

  /**
   * Gets the index of the first row in the currently range of rows.
   * This index is zero-based. This attribute is used to control
   * which range of rows to display to the user.
   *
   * @return  the new first value
   */
  final public int getFirst()
  {
    return ComponentUtils.resolveInteger(getProperty(FIRST_KEY), 0);
  }

  /**
   * Sets the index of the first row in the currently range of rows.
   * This index is zero-based. This attribute is used to control
   * which range of rows to display to the user.
   * 
   * @param first  the new first value
   */
  final public void setFirst(int first)
  {
    setProperty(FIRST_KEY, Integer.valueOf(first));
  }

  /**
   * Adds a rangeChange listener.
   *
   * @param listener  the rangeChange listener to add
   */
  final public void addRangeChangeListener(
    RangeChangeListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a rangeChange listener.
   *
   * @param listener  the rangeChange listener to remove
   */
  final public void removeRangeChangeListener(
    RangeChangeListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached rangeChange listeners.
   *
   * @return  an array of attached rangeChange listeners.
   */
  final public RangeChangeListener[] getRangeChangeListeners()
  {
    return (RangeChangeListener[])getFacesListeners(RangeChangeListener.class);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXSelectRange.
   */
  protected UIXSelectRange(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectRange","org.apache.myfaces.trinidad.ChoiceBar");
  }
}
