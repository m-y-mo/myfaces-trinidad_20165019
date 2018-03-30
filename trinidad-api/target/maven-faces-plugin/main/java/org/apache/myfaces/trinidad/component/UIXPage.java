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
import java.util.Iterator;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.RowDisclosureListener;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.RowKeySetTreeImpl;
import org.apache.myfaces.trinidad.model.TreeModel;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *           A Page component uses a MenuModel and a stamp to render navigation items.
 *           </html:p>
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
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXPage extends UIXNavigationHierarchy
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXNavigationHierarchy.TYPE);
  static public final PropertyKey ROW_DISCLOSURE_LISTENER_KEY =
    TYPE.registerKey("rowDisclosureListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey DISCLOSED_ROW_KEYS_KEY =
    TYPE.registerKey("disclosedRowKeys", RowKeySet.class);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey VAR_STATUS_KEY =
    TYPE.registerKey("varStatus", String.class, PropertyKey.CAP_NOT_BOUND);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final String NODE_STAMP_FACET = "nodeStamp";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Page";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Page";

  /**
   * Construct an instance of the UIXPage.
   */
  public UIXPage()
  {
    super("org.apache.myfaces.trinidad.BasePage");
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
    HierarchyUtils.__handleBroadcast(this, 
                                      event, 
                                      getDisclosedRowKeys(), 
                                      getRowDisclosureListener());
    super.broadcast(event);
  }
 
  @Override
 public CollectionModel createCollectionModel(CollectionModel current, Object value)
  {
    TreeModel model = (TreeModel)super.createCollectionModel(current, value);    
    RowKeySet treeState = getDisclosedRowKeys();
    treeState.setCollectionModel(model);    
    return model;
  }
 
  @Override
  @SuppressWarnings("unchecked")
  protected void processFacetsAndChildren(
    FacesContext context,
    PhaseId phaseId)
  {
    Object oldPath = getRowKey();
    setRowKey(null);
  
    HierarchyUtils.__iterateOverTree(context, 
                                      phaseId, 
                                      this, 
                                      getDisclosedRowKeys(),
                                      false);
    
    setRowKey(oldPath);

    // process the children
    TableUtils.__processChildren(context, this, phaseId);

    Map<String, UIComponent> facets = getFacets();
    Iterator<String> facetKeys = facets.keySet().iterator();

    while(facetKeys.hasNext())
    {
      String facetKey = facetKeys.next();
      if (!"nodeStamp".equals(facetKey))
      {
        processComponent(context, facets.get(facetKey), phaseId);
      }
    }
        
  }

  @Override
  void __encodeBegin(FacesContext context) throws IOException
  {
    HierarchyUtils.__handleEncodeBegin(this, getDisclosedRowKeys());
    super.__encodeBegin(context);
  }
  
  @Override
  void __init()
  {
    super.__init();
    if (getDisclosedRowKeys() == null)
      setDisclosedRowKeys(new RowKeySetTreeImpl());
  }  

 

  /**
   * the component to use to stamp each element in the
   *               menu. A CommandNavigationItem is expected.
   */
  final public UIComponent getNodeStamp()
  {
    return getFacet(NODE_STAMP_FACET);
  }

  /**
   * the component to use to stamp each element in the
   *               menu. A CommandNavigationItem is expected.
   */
  @SuppressWarnings("unchecked")
  final public void setNodeStamp(UIComponent nodeStampFacet)
  {
    getFacets().put(NODE_STAMP_FACET, nodeStampFacet);
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
   * Gets the hierarchy of menu data - must be of type 
   *             org.apache.myfaces.trinidad.model.MenuModel
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
   * Sets the hierarchy of menu data - must be of type 
   *             org.apache.myfaces.trinidad.model.MenuModel
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
   * Gets whether data validation 
   *           should be skipped when row disclosure
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
   *           should be skipped when row disclosure
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
   * Construct an instance of the UIXPage.
   */
  protected UIXPage(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Page","org.apache.myfaces.trinidad.BasePage");
  }
}
