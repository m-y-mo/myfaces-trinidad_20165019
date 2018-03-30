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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * Signifies an element that represents a process and binds to a menuModel.
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
public class UIXProcess extends UIXNavigationHierarchy
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXNavigationHierarchy.TYPE);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey VAR_STATUS_KEY =
    TYPE.registerKey("varStatus", String.class, PropertyKey.CAP_NOT_BOUND);
  static public final String NODE_STAMP_FACET = "nodeStamp";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Process";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Process";

  /**
   * Construct an instance of the UIXProcess.
   */
  public UIXProcess()
  {
    super("org.apache.myfaces.trinidad.ChoiceBar");
  }
    
  @Override
  protected void processFacetsAndChildren(
    FacesContext context,
    PhaseId phaseId)
  {
    Object oldPath = getRowKey();
    Object focusPath = getFocusRowKey();    
    setRowKey(focusPath);      
    // process stamp for one level 
    HierarchyUtils.__processLevel(context, phaseId, this);        
    setRowKey(oldPath);    
    
    // process the children
    TableUtils.__processChildren(context, this, phaseId);
    
  }  

  
  

  /**
   * the component to use to stamp each element in the
   *               process. A CommandNavigationItem is expected.
   */
  final public UIComponent getNodeStamp()
  {
    return getFacet(NODE_STAMP_FACET);
  }

  /**
   * the component to use to stamp each element in the
   *               process. A CommandNavigationItem is expected.
   */
  @SuppressWarnings("unchecked")
  final public void setNodeStamp(UIComponent nodeStampFacet)
  {
    getFacets().put(NODE_STAMP_FACET, nodeStampFacet);
  }

  /**
   * Gets the hierarchy of data - must be of type 
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
   * Sets the hierarchy of data - must be of type 
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
   * Construct an instance of the UIXProcess.
   */
  protected UIXProcess(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Process","org.apache.myfaces.trinidad.ChoiceBar");
  }
}
