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
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.FocusListener;
import org.apache.myfaces.trinidad.event.RowDisclosureEvent;
import org.apache.myfaces.trinidad.event.RowDisclosureListener;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.event.SelectionListener;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.ModelUtils;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.RowKeySetTreeImpl;
import org.apache.myfaces.trinidad.model.TreeModel;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *             Apache Trinidad tree components are used to display hierarchical data. 
 *             For example,
 *             if we have a personnel organization chart depicting all the direct 
 *             reports under 
 *             each employee, we could use a tree component to display this
 *             chart. While each element (employee) in the hierarchy may have any 
 *             number of
 *             child elements, each element can only have one parent element.
 *           </html:p>
 *       
 *           <section name="The Tree Model">
 *             <html:P>
 *               The Apache Trinidad tree components use a model to access the data in the
 *               underlying hierarchy.  The specific model class is
 *               <html:code>org.apache.myfaces.trinidad.model.TreeModel</html:code>.
 * 
 *               You may find the
 *               <html:code>org.apache.myfaces.trinidad.model.ChildPropertyTreeModel</html:code> class
 *               useful when constructing a <html:code>TreeModel</html:code>.
 *             </html:P>
 *           </section>
 * 
 *           <section name="Data">
 *             <html:P>
 *               The tree components use a stamping strategy similar to the Trinidad Table
 *               component.  Child components are used to display the
 *               data for each element in the tree. Each child component is not recreated
 *               per element; instead, each child is repeatedly
 *               rendered (stamped) once per element. Because of this stamping
 *               behavior, only certain types of components are supported as
 *               children. Supported components include all
 *               components with no behavior and most components that implement the
 *               EditableValueHolder or ActionSource interfaces.
 *             </html:P>
 *             <html:P>
 *               Each time a child component is stamped, the data for the current
 *               element is copied into an EL reachable property.  The
 *               name of this property is defined by the <html:code>var</html:code>
 *               property on
 *               the tree component. Once the tree has completed rendering, this property is
 *               removed (or reverted back to its previous value).
 *             </html:P>
 *           </section>
 *           <section name="Events">
 *             <html:P>
 *               When the user expands or collapses a subtree the tree
 *               generates a <html:code>DisclosureEvent</html:code>. This event has an
 *               <html:code>isExpanded</html:code> method that returns whether the user wants
 *               to expand or collapse the subtree of a particular element. That
 *               particular element is made current on the Tree before the event is
 *               delivered.
 *             </html:P>
 *           </section>
 * 
 *           <section name="Expand/Collapse State">
 *             <html:P>
 *               The Trinidad tree components use an instance of the
 *               <html:code>org.apache.myfaces.trinidad.model.RowKeySet</html:code>
 *               class to keep track
 *               of which elements are expanded. This instance is stored
 *               as the &quot;expandedRowKeys&quot; attribute on the component. You may use this
 *               instance to programmatically control the expand/collapse state of an
 *               element in the hierarchy.
 *             </html:P>
 *           </section>
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
public class UIXTree extends org.apache.myfaces.trinidad.component.UIXHierarchy
                     implements NamingContainer
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    org.apache.myfaces.trinidad.component.UIXHierarchy.TYPE);
  static public final PropertyKey SELECTED_ROW_KEYS_KEY =
    TYPE.registerKey("selectedRowKeys", RowKeySet.class);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final PropertyKey ROW_DISCLOSURE_LISTENER_KEY =
    TYPE.registerKey("rowDisclosureListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey DISCLOSED_ROW_KEYS_KEY =
    TYPE.registerKey("disclosedRowKeys", RowKeySet.class);
  static public final PropertyKey SELECTION_LISTENER_KEY =
    TYPE.registerKey("selectionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey VAR_STATUS_KEY =
    TYPE.registerKey("varStatus", String.class, PropertyKey.CAP_NOT_BOUND);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey FOCUS_ROW_KEY_KEY =
    TYPE.registerKey("focusRowKey");
  static public final PropertyKey FOCUS_LISTENER_KEY =
    TYPE.registerKey("focusListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey INITIALLY_EXPANDED_KEY =
    TYPE.registerKey("initiallyExpanded", Boolean.class, Boolean.FALSE);
  static public final String NODE_STAMP_FACET = "nodeStamp";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Tree";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Tree";

  /**
   * Construct an instance of the UIXTree.
   */
  public UIXTree()
  {
    super("org.apache.myfaces.trinidad.Tree");
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
   * Delivers an event.
   * @param event
   * @throws javax.faces.event.AbortProcessingException
   */
  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  { 
    if (event instanceof SelectionEvent)
    {
      //pu: Implicitly record a Change for 'selectionState' attribute
      //=-=pu: This ain't getting restored. Check with Arj or file a bug.
      addAttributeChange("selectedRowKeys",
                         getSelectedRowKeys());
      broadcastToMethodBinding(event, getSelectionListener());
    }

    HierarchyUtils.__handleBroadcast(this, 
                                      event, 
                                      getDisclosedRowKeys(), 
                                      getRowDisclosureListener());
    super.broadcast(event);
  }
 
  @Override
  public CollectionModel createCollectionModel(CollectionModel current, Object value)
  {
    
    TreeModel model = ModelUtils.toTreeModel(value);
    model.setRowKey(null);

    RowKeySet selectedRowKeys = getSelectedRowKeys();

    if (selectedRowKeys == null)
    {
      selectedRowKeys = new RowKeySetTreeImpl();
      setSelectedRowKeys(selectedRowKeys);
    }

    RowKeySet disclosedRowKeys = getDisclosedRowKeys();

    if (disclosedRowKeys == null)
    {
      disclosedRowKeys = new RowKeySetTreeImpl();
      setDisclosedRowKeys(disclosedRowKeys);
    }

    selectedRowKeys.setCollectionModel(model);
    disclosedRowKeys.setCollectionModel(model);

    return model;
  }

  @Override
  protected void processFacetsAndChildren(
    FacesContext context,
    PhaseId phaseId)
  {
    // this component has no facets that need to be processed once.
    // instead process the "nodeStamp" facet as many times as necessary:
    Object oldPath = getRowKey();
    setRowKey(null);
    HierarchyUtils.__iterateOverTree(context, 
                                     phaseId, 
                                     this, 
                                     getDisclosedRowKeys(),
                                     true);
    setRowKey(oldPath);
  }

  @Override
  void __init()
  {
    super.__init();
    if (getDisclosedRowKeys() == null)
      setDisclosedRowKeys(new RowKeySetTreeImpl());
    if (getSelectedRowKeys() == null)
      setSelectedRowKeys(new RowKeySetTreeImpl());
  }
  
  
  /**
   * Gets the internal state of this component.
   */
  @Override
  Object __getMyStampState()
  {
    Object[] state = new Object[4];
    state[0] = super.__getMyStampState();
    state[1] = getFocusRowKey();    
    state[2] = getSelectedRowKeys();
    state[3] = getDisclosedRowKeys();
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
    setFocusRowKey(state[1]);
    setSelectedRowKeys((RowKeySet) state[2]);
    setDisclosedRowKeys((RowKeySet) state[3]);
  }
  
 
  private final static String EXPAND_ONCE_KEY = "initialExpandCompleted";

  /**
   * @see org.apache.myfaces.trinidad.component.UIXCollection#__encodeBegin(javax.faces.context.FacesContext)
   */
  @Override @SuppressWarnings("unchecked")
  protected void __encodeBegin(FacesContext context) throws IOException
  {
    if (isInitiallyExpanded() && !Boolean.TRUE.equals(getAttributes().get(EXPAND_ONCE_KEY)))
    {
      Object oldRowKey = getRowKey();
      try
      {
        Object rowKey = getFocusRowKey();
        if (rowKey == null)
        {
          setRowIndex(0);
          rowKey = getRowKey();
        }

        setRowKey(rowKey);
        RowKeySet old = getDisclosedRowKeys();
        RowKeySet newset = old.clone();
        newset.addAll();

        // use an event to ensure the row disclosure listener is called
        broadcast(new RowDisclosureEvent(old, newset, this));
      }
      finally
      {
        setRowKey(oldRowKey);
      }

      // use attributes to store that we have processed the initial expansion
      // as there is no support for private properties in the plug-in at the
      // moment
      getAttributes().put(EXPAND_ONCE_KEY, Boolean.TRUE);
    }
    super.__encodeBegin(context);    
  }

  /**
   * the component to use to stamp each element in the
   *               tree. Only certain types of components are supported, 
   *               including all
   *               components with no behavior and most components that implement the
   *               EditableValueHolder or ActionSource interfaces.  In a treeTable, this must be a column.
   */
  final public UIComponent getNodeStamp()
  {
    return getFacet(NODE_STAMP_FACET);
  }

  /**
   * the component to use to stamp each element in the
   *               tree. Only certain types of components are supported, 
   *               including all
   *               components with no behavior and most components that implement the
   *               EditableValueHolder or ActionSource interfaces.  In a treeTable, this must be a column.
   */
  @SuppressWarnings("unchecked")
  final public void setNodeStamp(UIComponent nodeStampFacet)
  {
    getFacets().put(NODE_STAMP_FACET, nodeStampFacet);
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
   * Gets <html>
   *           Name of the EL variable used to reference the varStatus information.
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
   *           Name of the EL variable used to reference the varStatus information.
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
   * Gets the hierarchy of tree data - must be of type 
   *         org.apache.myfaces.trinidad.model.TreeModel
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
   * Sets the hierarchy of tree data - must be of type 
   *         org.apache.myfaces.trinidad.model.TreeModel
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
   * Gets the rowKey of the currently focused row.
   *         The rowKeys of the ancestor rows of the focus row are added
   *         to the expandedRowKeys RowKeySet by default.
   *
   * @return  the new focusRowKey value
   */
  final public Object getFocusRowKey()
  {
    return getProperty(FOCUS_ROW_KEY_KEY);
  }

  /**
   * Sets the rowKey of the currently focused row.
   *         The rowKeys of the ancestor rows of the focus row are added
   *         to the expandedRowKeys RowKeySet by default.
   * 
   * @param focusRowKey  the new focusRowKey value
   */
  final public void setFocusRowKey(Object focusRowKey)
  {
    setProperty(FOCUS_ROW_KEY_KEY, (focusRowKey));
  }

  /**
   * Gets a method reference to a focus listener
   *
   * @return  the new focusListener value
   */
  final public MethodBinding getFocusListener()
  {
    return (MethodBinding)getProperty(FOCUS_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a focus listener
   * 
   * @param focusListener  the new focusListener value
   */
  final public void setFocusListener(MethodBinding focusListener)
  {
    setProperty(FOCUS_LISTENER_KEY, (focusListener));
  }

  /**
   * Gets If upon initial rendering, the current subtree under the focused row path
   *         should be expanded. A RowDisclosureEvent is broadcast from the encode begin of the 
   *         component so that listeners are properly notified of the disclosure.
   *
   * @return  the new initiallyExpanded value
   */
  final public boolean isInitiallyExpanded()
  {
    return ComponentUtils.resolveBoolean(getProperty(INITIALLY_EXPANDED_KEY), false);
  }

  /**
   * Sets If upon initial rendering, the current subtree under the focused row path
   *         should be expanded. A RowDisclosureEvent is broadcast from the encode begin of the 
   *         component so that listeners are properly notified of the disclosure.
   * 
   * @param initiallyExpanded  the new initiallyExpanded value
   */
  final public void setInitiallyExpanded(boolean initiallyExpanded)
  {
    setProperty(INITIALLY_EXPANDED_KEY, initiallyExpanded ? Boolean.TRUE : Boolean.FALSE);
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
   * Adds a focus listener.
   *
   * @param listener  the focus listener to add
   */
  final public void addFocusListener(
    FocusListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a focus listener.
   *
   * @param listener  the focus listener to remove
   */
  final public void removeFocusListener(
    FocusListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached focus listeners.
   *
   * @return  an array of attached focus listeners.
   */
  final public FocusListener[] getFocusListeners()
  {
    return (FocusListener[])getFacesListeners(FocusListener.class);
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
   * Construct an instance of the UIXTree.
   */
  protected UIXTree(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Tree","org.apache.myfaces.trinidad.Tree");
  }
}
