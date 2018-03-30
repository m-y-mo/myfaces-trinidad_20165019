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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.FocusEvent;
import org.apache.myfaces.trinidad.event.RangeChangeEvent;
import org.apache.myfaces.trinidad.event.RangeChangeListener;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *           The Apache Trinidad TreeTable is used to display data that is structured in a hierarchical format.
 *           This component displays a hierarchy
 *           in a UI similar to a Trinidad Table, and is more elaborate than the Tree component.
 *           TreeTable supports displaying columns of data per element in the hierarchy.
 *           Unlike the Tree component, TreeTable
 *           only supports single rooted hierarchies. The features of the TreeTable
 *           component include mechanisms for focusing in on subtrees (within the main
 *           tree), as well as expanding and collapsing elements in the hierarchy.
 *         </html:p>
 * 
 *         <html:p>
 *           Like the Table, the TreeTable's children must be Trinidad
 *           Column components. Like the Tree, the TreeTable has a &quot;nodeStamp&quot;
 *           facet which renders the &quot;Object Name&quot; Column.
 * 
 *           The &quot;Object Name&quot; Column contains the primary identifier of an element
 *           in the hierarchy. For example, in an organization chart of employees, the &quot;Object Name&quot;
 *           Column might be the employee name.
 *         </html:p>
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
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.FocusEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">Event delivered when user clicks to focus on (or zoom into) a particular element's subtree of children.
      	        The TreeTable responds to this event by modifying the "focusPath" property appropriately.
      	        Subsequently, any registered FocusListener instances are called.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXTreeTable extends UIXTree
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXTree.TYPE);
  static public final PropertyKey ROOT_NODE_RENDERED_KEY =
    TYPE.registerKey("rootNodeRendered", Boolean.class, Boolean.TRUE);
  static public final PropertyKey ROWS_BY_DEPTH_KEY =
    TYPE.registerKey("rowsByDepth", int[].class);
  static public final PropertyKey RANGE_CHANGE_LISTENER_KEY =
    TYPE.registerKey("rangeChangeListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.TreeTable";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.TreeTable";

  /**
   * Construct an instance of the UIXTreeTable.
   */
  public UIXTreeTable()
  {
    super("org.apache.myfaces.trinidad.BaseTreeTable");
  }
  
  /**
   * Gets the maximum number of rows to show.
   * This changes depending on the depth of the current row in the tree
   * hierarchy.
   * The rows per depth is obtained from
   * {@link #getRowsByDepth}.
   * @return 0 if all rows must be shown at this level.
   */
  @Override
  public final int getRows()
  {
    int depth = getTreeModel().getDepth();
    assert depth >= 0;

    // the root element is selected when depth is zero:
    if (depth==0)
      return 1; // the treeTable only shows the first root node.

    int[] rows = getRowsByDepth();
    if ((rows == null) || (rows.length == 0))
      return 0;

    depth--;

    // in a treeTable, the the first "rows" property affects how many
    // children of the root element to show.
    return (depth >= rows.length) ? rows[rows.length - 1] : rows[depth];
  }

  /**
   * Gets the range start index for the current collection.
   * The current collection is the children of the parent of the
   * current rowData. ie: the current collection is the collection of
   * siblings of the current rowData.
   * @return zero based index of the row that must be displayed first.
   * @see #getRowData()
   */
  @Override
  public final int getFirst()
  {
    // "first" does not change per path. It changes per parent path.
    // this is because "first", "rows" and "rowCount" applies to the container
    // element and not the current element:
    Object container = _getContainerPath();
    Integer first = _firstMap.get(container);
    return (first != null) ? first.intValue() : 0;
  }

  /**
   * Sets the range start index for the current collection.
   * The current collection is the children of the parent of the
   * current rowData. ie: the current collection is the collection of
   * siblings of the current rowData.
   * @param index zero based index of the row that must be displayed first.
   * @see #getRowData()
   */
  public void setFirst(int index)
  {
    // "first" does not change per path. It changes per parent path.
    // this is because "first", "rows" and "rowCount" applies to the container
    // element and not the current element:
    Object container = _getContainerPath();
    Map<Object, Integer> comparant = Collections.emptyMap();
    if (_firstMap == comparant)
      _firstMap = new HashMap<Object, Integer>(3);

    if (index <= 0)
      _firstMap.remove(container);
    else
      _firstMap.put(container, Integer.valueOf(index));
  }

  /**
   * Adds a RangeChangeListener.
   */
  public void addRangeChangeListener(RangeChangeListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a RangeChangeListener.
   */
  public void removeRangeChangeListener(RangeChangeListener listener)
  {
    removeFacesListener(listener);
  }


  /**
   * Retrieves all RangeChangeListeners
   */
  public RangeChangeListener[] getRangeChangeListeners()
  {
    return (RangeChangeListener[]) getFacesListeners(RangeChangeListener.class);
  }

  @Override
  public Object saveState(FacesContext context)
  {
    Object[] array = new Object[2];
    array[0] = super.saveState(context);
    array[1] = (_firstMap.isEmpty()) ? null : _firstMap;

    if (array[0] == null && array[1] == null)
      return null;

    return array;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void restoreState(FacesContext context, Object state)
  {
    Object[] array = (Object[]) state;
    super.restoreState(context, array[0]);
    _firstMap = (Map<Object, Integer>) array[1];
    if (_firstMap == null)
      _firstMap = Collections.emptyMap();
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    // Notify the specified disclosure listener method (if any)
    if (event instanceof FocusEvent)
    {
      setFocusRowKey(getRowKey());
      //pu: Implicitly record a Change for 'focusPath' attribute
      addAttributeChange("focusPath",
                         getFocusRowKey());
      // it is nice to expand the focused item:
      getDisclosedRowKeys().add();

      broadcastToMethodBinding(event, getFocusListener());
    }
    else if (event instanceof RangeChangeEvent)
    {
      RangeChangeEvent rce = (RangeChangeEvent) event;
      setFirst(rce.getNewStart());
      //pu: Implicitly record a Change for 'first' attribute
      //=-=pu: This ain't getting restored. Check with Arj or file a bug.
      addAttributeChange("first",
                         Integer.valueOf(rce.getNewStart()));
      broadcastToMethodBinding(event, getRangeChangeListener());
    }

    // Perform standard superclass processing
    super.broadcast(event);
  }


  /**
   * Gets the stamps. This returns the children of this component plus
   * the nodeStamp stamp (if any).
   */
  // TODO cache the result.
  @Override
  @SuppressWarnings("unchecked")
  protected final List getStamps()
  {
    List<UIComponent> children = getChildren();
    UIComponent nodeStamp = getNodeStamp();
    if (nodeStamp != null)
    {
      List<UIComponent> stamps = new ArrayList<UIComponent>(children.size() + 1);
      stamps.addAll(children);
      stamps.add(nodeStamp);
      return stamps;
    }
    return children;
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

  @SuppressWarnings("unchecked")
  @Override
  protected final void processFacetsAndChildren(
    FacesContext context,
    PhaseId phaseId)
  {
    // process all the facets of this hgrid just once
    // (except for the "nodeStamp" facet which must be processed once
    // per row):
    TableUtils.__processFacets(context, this, this, phaseId,
      UIXTreeTable.NODE_STAMP_FACET);

    UIComponent nodeStamp = getNodeStamp();
    // process any facets of the nodeStamp column:
    TableUtils.__processFacets(context, this, nodeStamp, phaseId, null);

    // process all the facets of this table's column children:
    TableUtils.__processColumnFacets(context, this, this, phaseId);

    // recursively process any grandchild columns of the nodeStamp column:
    TableUtils.__processColumnFacets(context, this, nodeStamp, phaseId);

    Object oldPath = getRowKey();
    RowKeySet state = getDisclosedRowKeys();
    try
    {
      Object path = getFocusRowKey();
      setRowKey(path);
      if (path == null)
      {
        HierarchyUtils.__iterateOverTree(context,
                                         phaseId,
                                         this,
                                         state,
                                         true);        

      }
      else
      {
        TableUtils.__processStampedChildren(context, this, phaseId);
        processComponent(context, nodeStamp, phaseId); // bug 4688568
  
        if (state.isContained())
        {
          enterContainer();
          HierarchyUtils.__iterateOverTree(context,
                                           phaseId,
                                           this,
                                           state,
                                           true);
        }
      }
    }
    finally
    {
      setRowKey(oldPath);
    }
  }

  /**
   * Gets the path of the parent
   */
  private Object _getContainerPath()
  {
    Object parentKey = getTreeModel().getContainerRowKey();
    return parentKey;
  }

  /**
   * Gets the internal state of this component.
   */
  @Override
  Object __getMyStampState()
  {
    Object[] state = new Object[2];
    state[0] = super.__getMyStampState();
    state[1] = (_firstMap.isEmpty()) ? null : _firstMap;

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
    super.__setMyStampState(state[0]);
    _firstMap = (Map<Object, Integer>) state[1];
    if (_firstMap == null)
      _firstMap = Collections.emptyMap();
  }

  private Map<Object, Integer> _firstMap = Collections.emptyMap();

  /**
   * Gets If the root node should be rendered or not. Defaults to true.
   *
   * @return  the new rootNodeRendered value
   */
  final public boolean isRootNodeRendered()
  {
    return ComponentUtils.resolveBoolean(getProperty(ROOT_NODE_RENDERED_KEY), true);
  }

  /**
   * Sets If the root node should be rendered or not. Defaults to true.
   * 
   * @param rootNodeRendered  the new rootNodeRendered value
   */
  final public void setRootNodeRendered(boolean rootNodeRendered)
  {
    setProperty(ROOT_NODE_RENDERED_KEY, rootNodeRendered ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the maximum number of records that can be displayed at
   *               one time (range size).
   *               Each level of depth in the tree can have a different range size.
   *               The first number in the array sets the range size for the root
   *               collection. Each subsequent number sets the range size for the
   *               corresponding depth. The last number becomes the default for
   *               each subsequent level of depth.
   * 
   *               If a node has more children than
   *               the range size, navigation rows will be rendered above and
   *               below the child nodes.
   *
   * @return  the new rowsByDepth value
   */
  final public int[] getRowsByDepth()
  {
    return (int[])getProperty(ROWS_BY_DEPTH_KEY);
  }

  /**
   * Sets the maximum number of records that can be displayed at
   *               one time (range size).
   *               Each level of depth in the tree can have a different range size.
   *               The first number in the array sets the range size for the root
   *               collection. Each subsequent number sets the range size for the
   *               corresponding depth. The last number becomes the default for
   *               each subsequent level of depth.
   * 
   *               If a node has more children than
   *               the range size, navigation rows will be rendered above and
   *               below the child nodes.
   * 
   * @param rowsByDepth  the new rowsByDepth value
   */
  final public void setRowsByDepth(int[] rowsByDepth)
  {
    setProperty(ROWS_BY_DEPTH_KEY, (rowsByDepth));
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
   * Construct an instance of the UIXTreeTable.
   */
  protected UIXTreeTable(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.TreeTable","org.apache.myfaces.trinidad.BaseTreeTable");
  }
}
