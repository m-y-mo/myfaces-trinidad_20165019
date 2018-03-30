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
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.faces.render.Renderer;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.ModelUtils;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <p>UIXIterator is a component that performs iteration over its child components. It is similar to UIXTable
 * but has no chrome.
 *  Each child is repeatedly stamped as many times as necessary.
 *  Iteration is done starting at the index given by the &quot;first&quot; attribute,
 *  for as many indices as specified by the &quot;rows&quot; attribute.
 *  If &quot;rows&quot; returns 0, then the iteration continues until 
 *  there are no more elements in the underlying data.
 *  </p>
 *  <p> 
 *   While the &lt;tr:forEach&gt;
 * will be sufficient for most user's needs, it does not work with a JSF
 * DataModel, or CollectionModel. It also cannot be bound to EL expressions that
 * use component-managed EL variables
 * (such as the &quot;var&quot; variable on an &lt;tr:table&gt;), because
 * a forEach tag runs during
 * The &lt;tr:iterator&gt; tag was created to
 * address these issues.
 * </p>
 * <p>
 * To list all, the benefits of UIXIterator over forEach:
 * <ul>
 * <li>Access to component-managed EL variables</li>
 * <li>Full support for CollectionModel and DataModel</li>
 * <li>Does not require creating multiple copies of children,
 * so more memory efficient</li>
 * <li>Much better at dealing with adding and deleting children,
 * at least when used with a CollectionModel with a good
 * implementation of getRowKey()</li>
 * <li>Supports "binding", and all other forms of JSF component
 * manipulation</li>
 * </ul>
 * and the negative aspects:
 * <ul>
 * <li>Leaves behind a component in the hierarchy, which causes
 * problems with components like panelFormLayout that try to handle each child
 * individually.</li>
 * <li>Because there's only one of each child, the same limitations
 * on "binding", etc., as apply inside a table also apply to iterator.</li>
 * </ul>
 * </p>
 * <p>By default, it processes up to 25 rows. Use the rows attribute to alter this behavior.</p>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXIterator extends UIXCollection
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXCollection.TYPE);
  static public final PropertyKey VAR_STATUS_KEY =
    TYPE.registerKey("varStatus", String.class, PropertyKey.CAP_NOT_BOUND);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey ROWS_KEY =
    TYPE.registerKey("rows", Integer.class, Integer.valueOf(25));
  static public final PropertyKey FIRST_KEY =
    TYPE.registerKey("first", Integer.class, Integer.valueOf(0));

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Iterator";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Iterator";

  /**
   * Construct an instance of the UIXIterator.
   */
  public UIXIterator()
  {
    super(null);
  }
  

  /**
   * Override to return true.
   */
  @Override
  public boolean getRendersChildren()
  {
    return true;
  }

  /**
   * Repeatedly render the children as many times as needed.
   */
  @Override
  public void encodeChildren(final FacesContext context)
    throws IOException
  {
    if (!isRendered())
      return;

    // if this is the table there will be a rendererType:
    if (getRendererType() != null)
    {
      Renderer renderer = getRenderer(context);
      if (renderer != null)
      {
        renderer.encodeChildren(context, this);
      }
    }
    else // this is not the table. it must be the iterator
    {
      Runner runner = new Runner()
      {
        @Override
        protected void process(UIComponent kid) throws IOException
        {
          __encodeRecursive(context, kid);
        }
      };
      runner.run();
      Exception exp = runner.exception;
      if (exp != null)
      {
        if (exp instanceof RuntimeException)
          throw (RuntimeException) exp;

        if (exp instanceof IOException)
          throw (IOException) exp;
        throw new IllegalStateException(exp);
      }
    }
  }

  /**
   * Enhances the varStatusMap created by the super class to include:<ul>
   * <li>begin - the index of the first row being rendered
   * <li>first - true if the current row is the first row
   * <li>count - indicates which iteration this is. This always starts at one,
   * and increases (by one) as the loop progresses.
   * <li>step - this is always one.
   * </ul>
   */
  @Override
  protected Map<String, Object> createVarStatusMap()
  {
    final Map<String, Object> map = super.createVarStatusMap();
    return new AbstractMap<String, Object>()
    {
      @Override
      public Object get(Object key)
      {
        // some of these keys are from <c:forEach>, ie:
        // javax.servlet.jsp.jstl.core.LoopTagStatus 
        if ("begin".equals(key)) // from jstl
        {
          return Integer.valueOf(getFirst());
        }
        if ("first".equals(key)) // from jstl
        {
          boolean isFirst = (getFirst() == getRowIndex());
          return Boolean.valueOf(isFirst);
        }
        if ("count".equals(key)) // from jstl
        {
          int count = getRowIndex() - getFirst() + 1;
          return Integer.valueOf(count);
        }
        if ("step".equals(key)) // from jstl
        {
          return Integer.valueOf(1);
        }
        return map.get(key);
      }
    
      @Override
      public Set<Map.Entry<String, Object>> entrySet()
      {
        return map.entrySet();
      }
    };
  }

  @Override
  protected CollectionModel createCollectionModel(
    CollectionModel current,
    Object value)
  {
    CollectionModel model = ModelUtils.toCollectionModel(value); 
    // initialize to -1. we need to do this incase some application logic
    // changed this index. Also, some JSF1.0 RI classes were initially starting
    // with a rowIndex of 0.
    // we need this to be -1 because of name-transformation.
    model.setRowIndex(-1);
    assert model.getRowIndex() == -1 : "RowIndex did not reset to -1";
    return model;
  }

  @Override
  protected void processFacetsAndChildren(
    final FacesContext context,
    final PhaseId phaseId)
  {
    Runner runner = new Runner()
    {
      @Override
      protected void process(UIComponent kid)
      {
        processComponent(context, kid, phaseId);
      }
    };
    runner.run();
  }

  private abstract class Runner
  {
    public final void run()
    {
      List<UIComponent> stamps = getStamps();
      int oldIndex = getRowIndex();
      int first = getFirst();
      int rows = getRows();
      int end = (rows <= 0) //show everything
        ? Integer.MAX_VALUE
        : first + rows;
      try
      {
        for(int i=first; i<end; i++)
        {
          setRowIndex(i);
          if (isRowAvailable())
          {
            for(UIComponent stamp : stamps)
            {
              process(stamp);
            }
          }
          else
            break;
        }
      }
      catch (Exception e)
      {
        exception = e;
      }
      finally
      {
        setRowIndex(oldIndex);
      }
    }
    
    public Exception exception = null;
    protected abstract void process(UIComponent comp) throws Exception;
  }

  @Override
  void __encodeBegin(FacesContext context) throws IOException
  {
    _fixupFirst();
    super.__encodeBegin(context);
  }

  // make sure the current range exists on the model:
  // see bug 4143852:
  private void _fixupFirst()
  {
    int first = getFirst();
    // if we are starting from row zero then there is no problem:
    if (first == 0)
      return;

    // Negative "first" makes no sense. Given the logic below,
    // it forces iterator to scroll to the end unnecessarily.
    if (first < 0)
    {
      setFirst(0);
      return;
    }

    CollectionModel model = getCollectionModel();
    int oldIndex = model.getRowIndex();
    try
    {
      model.setRowIndex(first);
      // if the starting row doesn't exist then we need to scroll back:
      if (!model.isRowAvailable())
      {
        int size = model.getRowCount();
        int rows = getRows();
        // if the rowCount is unknown OR
        //    the blockSize is show all OR
        //    there are fewer rows than the blockSize on the table
        // then start from the beginning:
        if ((size <= 0) || (rows <= 0) || (size <= rows))
          first = 0;
        else
        {
          // scroll to the last page: 
          first = size - rows;
          model.setRowIndex(first);
          // make sure the row is indeed available:
          if (!model.isRowAvailable())
          {
            // row is not available. this happens when getRowCount() lies.
            // Some DataModel implementations seem to have rowCount methods which
            // lie. see bug 4157186
            first = 0;
          }
        }
        setFirst(first);
      }
    }
    finally
    {
      model.setRowIndex(oldIndex);
    }
  }


  /**
   * Gets <html>
   *  Name of the EL variable used to reference the varStatus information.
   *           Once this component has completed rendering, this variable is
   *           removed (or reverted back to its previous value).
   *           The VarStatus provides contextual information about the state of the
   *           component to EL expressions. For components that iterate, varStatus
   *           also provides loop counter information.  Please see the this 
   *           component's documentation for the specific properties on the varStatus.
   *           The common properties on varStatus include:<ul><li>"model" - returns the CollectionModel for this component</li><li>"index" - returns the zero based row index</li></ul></html>
   *
   * @return  the new varStatus value
   */
  final public String getVarStatus()
  {
    return ComponentUtils.resolveString(getProperty(VAR_STATUS_KEY));
  }

  /**
   * Sets <html>
   *  Name of the EL variable used to reference the varStatus information.
   *           Once this component has completed rendering, this variable is
   *           removed (or reverted back to its previous value).
   *           The VarStatus provides contextual information about the state of the
   *           component to EL expressions. For components that iterate, varStatus
   *           also provides loop counter information.  Please see the this 
   *           component's documentation for the specific properties on the varStatus.
   *           The common properties on varStatus include:<ul><li>"model" - returns the CollectionModel for this component</li><li>"index" - returns the zero based row index</li></ul></html>
   * 
   * @param varStatus  the new varStatus value
   */
  final public void setVarStatus(String varStatus)
  {
    setProperty(VAR_STATUS_KEY, (varStatus));
  }

  /**
   * Gets the data model being used by this component.
   * The specific model class is
   *         <code>org.apache.myfaces.trinidad.model.CollectionModel</code>.
   * 
   *         You may also use other model instances, e.g.,  
   *         <code>java.util.List</code>  ,
   *         array, and  <code>javax.faces.model.DataModel</code>.
   *         This component will automatically convert the instance
   *         into a <code>CollectionModel</code>.
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
   * Sets the data model being used by this component.
   * The specific model class is
   *         <code>org.apache.myfaces.trinidad.model.CollectionModel</code>.
   * 
   *         You may also use other model instances, e.g.,  
   *         <code>java.util.List</code>  ,
   *         array, and  <code>javax.faces.model.DataModel</code>.
   *         This component will automatically convert the instance
   *         into a <code>CollectionModel</code>.
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
   * The default is 25.
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
   * The default is 25.
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
   * Construct an instance of the UIXIterator.
   */
  protected UIXIterator(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lock();
  }
}
