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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import org.apache.myfaces.trinidad.event.RowDisclosureEvent;
import org.apache.myfaces.trinidad.event.RowDisclosureListener;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.event.SelectionListener;
import org.apache.myfaces.trinidad.event.SortEvent;
import org.apache.myfaces.trinidad.event.SortListener;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.RowKeySetImpl;
import org.apache.myfaces.trinidad.model.SortCriterion;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.RowDisclosureEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The expansion event is generated for a table when the detail facet of a row is expanded or collapsed. For tree or a treeTable, the expansion
                       event is generated when tree nodes are expanded or collapsed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.SelectionEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The selection event is delivered when the table selection
                       changes.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.RangeChangeEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The range change event is delivered when the user
                       navigates.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.SortEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The sort event is delivered when the table column sort
                       criteria is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXTable extends UIXIterator
                      implements CollectionComponent
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXIterator.TYPE);
  static public final PropertyKey ROW_DISCLOSURE_LISTENER_KEY =
    TYPE.registerKey("rowDisclosureListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey DISCLOSED_ROW_KEYS_KEY =
    TYPE.registerKey("disclosedRowKeys", RowKeySet.class);
  static public final PropertyKey SELECTION_LISTENER_KEY =
    TYPE.registerKey("selectionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey SELECTED_ROW_KEYS_KEY =
    TYPE.registerKey("selectedRowKeys", RowKeySet.class);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final PropertyKey SORT_LISTENER_KEY =
    TYPE.registerKey("sortListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey RANGE_CHANGE_LISTENER_KEY =
    TYPE.registerKey("rangeChangeListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey SHOW_ALL_KEY =
    TYPE.registerKey("showAll", Boolean.class, Boolean.FALSE);
  static public final String DETAIL_STAMP_FACET = "detailStamp";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Table";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Table";

  /**
   * Construct an instance of the UIXTable.
   */
  public UIXTable()
  {
    super("org.apache.myfaces.trinidad.Table");
  }
  
  @Override
  public void setSortCriteria(List<SortCriterion> criteria)
  {
    _sortCriteria = criteria;
    super.setSortCriteria(criteria);
  }

  /**
   * Sets the phaseID of UI events depending on the "immediate" property.
   */
  @Override
  public void queueEvent(FacesEvent event)
  {
    TableUtils.__handleQueueEvent(this, event);
    super.queueEvent(event);
  }

  /**
   * Delivers an event to the appropriate listeners.
   * @param event
   * @throws javax.faces.event.AbortProcessingException
   */
  @Override
  public void broadcast(FacesEvent event)
    throws AbortProcessingException
  {
    // the order of processing is
    // 1. do any default action handling
    // 2. invoke any actionListener method binding
    // 3. call all the registered ActionListener instances.

    // Deliver to the default RangeChangeListener
    if (event instanceof RangeChangeEvent)
    {
      RangeChangeEvent rEvent = (RangeChangeEvent) event;
      int first = rEvent.getNewStart();
      setFirst(first);
      //pu: Implicitly record a Change for 'first' attribute
      addAttributeChange("first", Integer.valueOf(first));
      
      if ((first == 0) && (rEvent.getNewEnd() == getRowCount()))
      {
        setShowAll(true);
        //pu: Implicitly record a Change for 'showAll' attribute
        addAttributeChange("showAll", Boolean.TRUE);
      }
      else if (isShowAll())
      {
        setShowAll(false);
        //pu: Implicitly record a Change for 'showAll' attribute
        addAttributeChange("showAll", Boolean.FALSE);
      }
      // since the range is now different we can clear the currency cache:
      clearCurrencyStringCache();
      
      broadcastToMethodBinding(event, getRangeChangeListener());
    }
    else if (event instanceof RowDisclosureEvent)
    {
      RowDisclosureEvent eEvent = (RowDisclosureEvent) event;
      RowKeySet set = getDisclosedRowKeys();
      set.addAll(eEvent.getAddedSet());
      set.removeAll(eEvent.getRemovedSet());
      broadcastToMethodBinding(event, getRowDisclosureListener());
    }
    else if (event instanceof SortEvent)
    {
      SortEvent sEvent = (SortEvent) event;
      setSortCriteria(sEvent.getSortCriteria());
      broadcastToMethodBinding(event, getSortListener());
    }
    else if (event instanceof SelectionEvent)
    {
      //pu: Implicitly record a Change for 'selectionState' attribute
      addAttributeChange("selectedRowKeys",
                         getSelectedRowKeys());
      broadcastToMethodBinding(event, getSelectionListener());
    }

    super.broadcast(event);
  }



  @Override
  @SuppressWarnings("unchecked")
  public Object saveState(FacesContext context)
  {
    Object o = super.saveState(context);
    if ((o == null) &&
        ((_sortCriteria == null) || _sortCriteria.isEmpty()))
      return null;

    return new Object[]{o, _sortCriteria};
  }

  @Override
  @SuppressWarnings("unchecked")
  public void restoreState(FacesContext context, Object state)
  {
    Object[] array = (Object[]) state;
    super.restoreState(context, array[0]);


    // Get the sort criteria - but *don't* call setSortCriteria()
    // here;  doing so would require getting the collection model,
    // and that may invoke client code that isn't quite in a state
    // to be invoked, in part because component "binding"s have not been
    // evaluated yet.
    List<SortCriterion> criteria = (List<SortCriterion>) array[1];
    _sortCriteria = criteria;
  }

  
  /**
   * Gets the data for the first selected row.
   * This is useful when using EL to get at column data for the selected
   * row when using a table with single selection.
   * @return null if there is nothing selected in the table.
   */
  public Object getSelectedRowData() 
  {
    RowKeySet state = getSelectedRowKeys();
    Iterator<Object> keys = state.iterator();
    if (keys.hasNext()) 
    {
      Object key = keys.next();
      CollectionModel model = getCollectionModel();
      Object old = model.getRowKey();
      try
      {
        model.setRowKey(key);
        if (isRowAvailable())
          return model.getRowData();
      }
      finally
      {
        model.setRowKey(old);
      }
    }
    return null;
  }

  @Override
  protected final void processFacetsAndChildren(
    FacesContext context,
    PhaseId phaseId)
  {
    // process all the facets of this table just once
    // (except for the "detailStamp" facet which must be processed once
    // per row):
    TableUtils.__processFacets(context, this, this, phaseId,
      UIXTable.DETAIL_STAMP_FACET);

    // process all the facets of this table's column children:
    TableUtils.__processColumnFacets(context, this, this, phaseId);

    // process all the children and the detailStamp as many times as necessary
    _processStamps(context, phaseId);
  }

  /**
   * Gets the stamps. This returns the children of this component plus
   * the detail stamp (if any).
   */
  // TODO cache the result
  @Override
  protected final List<UIComponent> getStamps()
  {
    List<UIComponent> children = super.getStamps();
    UIComponent detail = getDetailStamp();
    if (detail != null)
    {
      List<UIComponent> stamps = new ArrayList<UIComponent>(children.size() + 1);
      stamps.addAll(children);
      stamps.add(detail);
      return stamps;
    }
    return children;
  }

  /**
   * Saves the state for the given stamp.
   * This method avoids changing the state of facets on columns.
   */
  @Override
  protected final Object saveStampState(FacesContext context, UIComponent stamp)
  {
    if (stamp instanceof UIXColumn)
    {
      // if it is a column, we don't want the facets processed.
      // Only the children:
      return StampState.saveChildStampState(context, stamp, this);
    }
    else
      return super.saveStampState(context, stamp);
  }

  /**
   * Restores the state for the given stamp.
   * This method avoids changing the state of facets on columns.
   */
  @Override
  protected final void restoreStampState(FacesContext context, UIComponent stamp,
                                         Object stampState)
  {
    if (stamp instanceof UIXColumn)
    {
      // if it is a column, we don't want the facets processed.
      // Only the children:
      StampState.restoreChildStampState(context, stamp, this, stampState);
    }
    else
      super.restoreStampState(context, stamp, stampState);
  }

  @Override
  protected final CollectionModel createCollectionModel(
    CollectionModel current,
    Object value)
  {
    CollectionModel model = super.createCollectionModel(current, value); 

    RowKeySet selectedRowKeys = getSelectedRowKeys();

    if (selectedRowKeys == null)
    {
      selectedRowKeys = new RowKeySetImpl();
      setSelectedRowKeys(selectedRowKeys);
    }

    RowKeySet disclosedRowKeys = getDisclosedRowKeys();

    if (disclosedRowKeys == null)
    {
      disclosedRowKeys = new RowKeySetImpl();
      setDisclosedRowKeys(disclosedRowKeys);
    }

    selectedRowKeys.setCollectionModel(model);
    disclosedRowKeys.setCollectionModel(model);

    // If we were perviously sorted, restore the sort order:
    if (_sortCriteria != null)
    {
      model.setSortCriteria(_sortCriteria);
    }

    return model;
  }

  /**
   * Gets the internal state of this component.
   */
  @Override
  Object __getMyStampState()
  {
    Object[] state = new Object[6];
    state[0] = _sortCriteria;
    state[1] = super.__getMyStampState();
    state[2] = Integer.valueOf(getFirst());
    state[3] = Boolean.valueOf(isShowAll());
    state[4] = getSelectedRowKeys();
    state[5] = getDisclosedRowKeys();
    return state;
  }
  
  /**
   * Sets the internal state of this component.
   * @param stampState the internal state is obtained from this object.
   */
  @Override
  @SuppressWarnings("unchecked")
  void __setMyStampState(Object stampState)
  {
    Object[] state = (Object[]) stampState;
    _sortCriteria = (List<SortCriterion>) state[0];
    super.__setMyStampState(state[1]);
    setFirst(((Integer) state[2]).intValue());
    setShowAll(Boolean.TRUE == state[3]);
    setSelectedRowKeys((RowKeySet) state[4]);
    setDisclosedRowKeys((RowKeySet) state[5]);
  }

  private void _processStamps(
    FacesContext context,
    PhaseId phaseId)
  {
    // Process all the children
    CollectionModel tableData = getCollectionModel();
    if (tableData.getRowCount() != 0)
    {
      int startIndex = getFirst();
      int endIndex = isShowAll() ? getRowCount()-1 : TableUtils.getLast(this);

      UIComponent detail = getDetailStamp();
      RowKeySet disclosureState =
        (detail == null) ? null : getDisclosedRowKeys();

      for (int i = startIndex; i <= endIndex; i++)
      {
        setRowIndex(i);
        TableUtils.__processStampedChildren(context, this, phaseId);

        if ((disclosureState != null) && disclosureState.isContained())
        {
          assert getRowIndex() == i;
          processComponent(context, detail, phaseId);
        }
      }

      setRowIndex(-1);
    }
  }

  @Override
  void __init()
  {
    super.__init();
    if (getSelectedRowKeys() == null)
      setSelectedRowKeys(new RowKeySetImpl());
    if (getDisclosedRowKeys() == null)
      setDisclosedRowKeys(new RowKeySetImpl());
    // if "first" is valueBound, we can't deal with it changing 
    // during the lifecycle. So stash it as a local value.
    // see bug 4537121:
    setFirst(getFirst());
  }

  transient private List<SortCriterion> _sortCriteria = null;

  /**
   * the component to stamp below every row which is disclosed. Adding a
   * detail facet will automatically cause the detail column to be displayed.
   */
  final public UIComponent getDetailStamp()
  {
    return getFacet(DETAIL_STAMP_FACET);
  }

  /**
   * the component to stamp below every row which is disclosed. Adding a
   * detail facet will automatically cause the detail column to be displayed.
   */
  @SuppressWarnings("unchecked")
  final public void setDetailStamp(UIComponent detailStampFacet)
  {
    getFacets().put(DETAIL_STAMP_FACET, detailStampFacet);
  }

  /**
   * Gets a method reference to an ExpansionListener
   *
   * @return  the new rowDisclosureListener value
   */
  final public MethodBinding getRowDisclosureListener()
  {
    return (MethodBinding)getProperty(ROW_DISCLOSURE_LISTENER_KEY);
  }

  /**
   * Sets a method reference to an ExpansionListener
   * 
   * @param rowDisclosureListener  the new rowDisclosureListener value
   */
  final public void setRowDisclosureListener(MethodBinding rowDisclosureListener)
  {
    setProperty(ROW_DISCLOSURE_LISTENER_KEY, (rowDisclosureListener));
  }

  /**
   * Gets the set of disclosed rows for this component.
   * Each entry in the set is a rowKey.
   *
   * @return  the new disclosedRowKeys value
   */
  final public RowKeySet getDisclosedRowKeys()
  {
    return (RowKeySet)getProperty(DISCLOSED_ROW_KEYS_KEY);
  }

  /**
   * Sets the set of disclosed rows for this component.
   * Each entry in the set is a rowKey.
   * 
   * @param disclosedRowKeys  the new disclosedRowKeys value
   */
  final public void setDisclosedRowKeys(RowKeySet disclosedRowKeys)
  {
    setProperty(DISCLOSED_ROW_KEYS_KEY, (disclosedRowKeys));
  }

  /**
   * Gets a method reference to a selection listener
   *
   * @return  the new selectionListener value
   */
  final public MethodBinding getSelectionListener()
  {
    return (MethodBinding)getProperty(SELECTION_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a selection listener
   * 
   * @param selectionListener  the new selectionListener value
   */
  final public void setSelectionListener(MethodBinding selectionListener)
  {
    setProperty(SELECTION_LISTENER_KEY, (selectionListener));
  }

  /**
   * Gets the selection state for this component.
   *
   * @return  the new selectedRowKeys value
   */
  final public RowKeySet getSelectedRowKeys()
  {
    return (RowKeySet)getProperty(SELECTED_ROW_KEYS_KEY);
  }

  /**
   * Sets the selection state for this component.
   * 
   * @param selectedRowKeys  the new selectedRowKeys value
   */
  final public void setSelectedRowKeys(RowKeySet selectedRowKeys)
  {
    setProperty(SELECTED_ROW_KEYS_KEY, (selectedRowKeys));
  }

  /**
   * Gets whether or not data validation - client-side or
   *             server-side -
   *           should take place when
   *           events are generated by this component.
   * 
   *           When immediate is true, the default ActionListener
   *           provided by the JavaServer Faces implementation
   *           should be executed during Apply Request Values phase
   *           of the request processing lifecycle, rather than
   *           waiting until the Invoke Application phase.
   *
   * @return  the new immediate value
   */
  final public boolean isImmediate()
  {
    return ComponentUtils.resolveBoolean(getProperty(IMMEDIATE_KEY), false);
  }

  /**
   * Sets whether or not data validation - client-side or
   *             server-side -
   *           should take place when
   *           events are generated by this component.
   * 
   *           When immediate is true, the default ActionListener
   *           provided by the JavaServer Faces implementation
   *           should be executed during Apply Request Values phase
   *           of the request processing lifecycle, rather than
   *           waiting until the Invoke Application phase.
   * 
   * @param immediate  the new immediate value
   */
  final public void setImmediate(boolean immediate)
  {
    setProperty(IMMEDIATE_KEY, immediate ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets a method reference to a sort listener
   *
   * @return  the new sortListener value
   */
  final public MethodBinding getSortListener()
  {
    return (MethodBinding)getProperty(SORT_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a sort listener
   * 
   * @param sortListener  the new sortListener value
   */
  final public void setSortListener(MethodBinding sortListener)
  {
    setProperty(SORT_LISTENER_KEY, (sortListener));
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
   * Gets whether the "Show All" option is selected. The "Show All" option
   *         is available if there are less than 30 options and the row count in
   *         the data model is known.
   *
   * @return  the new showAll value
   */
  final public boolean isShowAll()
  {
    return ComponentUtils.resolveBoolean(getProperty(SHOW_ALL_KEY), false);
  }

  /**
   * Sets whether the "Show All" option is selected. The "Show All" option
   *         is available if there are less than 30 options and the row count in
   *         the data model is known.
   * 
   * @param showAll  the new showAll value
   */
  final public void setShowAll(boolean showAll)
  {
    setProperty(SHOW_ALL_KEY, showAll ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Adds a rowDisclosure listener.
   *
   * @param listener  the rowDisclosure listener to add
   */
  final public void addRowDisclosureListener(
    RowDisclosureListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a rowDisclosure listener.
   *
   * @param listener  the rowDisclosure listener to remove
   */
  final public void removeRowDisclosureListener(
    RowDisclosureListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached rowDisclosure listeners.
   *
   * @return  an array of attached rowDisclosure listeners.
   */
  final public RowDisclosureListener[] getRowDisclosureListeners()
  {
    return (RowDisclosureListener[])getFacesListeners(RowDisclosureListener.class);
  }

  /**
   * Adds a selection listener.
   *
   * @param listener  the selection listener to add
   */
  final public void addSelectionListener(
    SelectionListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a selection listener.
   *
   * @param listener  the selection listener to remove
   */
  final public void removeSelectionListener(
    SelectionListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached selection listeners.
   *
   * @return  an array of attached selection listeners.
   */
  final public SelectionListener[] getSelectionListeners()
  {
    return (SelectionListener[])getFacesListeners(SelectionListener.class);
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

  /**
   * Adds a sort listener.
   *
   * @param listener  the sort listener to add
   */
  final public void addSortListener(
    SortListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a sort listener.
   *
   * @param listener  the sort listener to remove
   */
  final public void removeSortListener(
    SortListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached sort listeners.
   *
   * @return  an array of attached sort listeners.
   */
  final public SortListener[] getSortListeners()
  {
    return (SortListener[])getFacesListeners(SortListener.class);
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
   * Construct an instance of the UIXTable.
   */
  protected UIXTable(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Table","org.apache.myfaces.trinidad.Table");
  }
}
