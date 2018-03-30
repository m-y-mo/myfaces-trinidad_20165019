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
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The switcher component dynamically decides which facet component
 * should be rendered.  It has two properties.  The switcher will render
 * the facet matching &quot;facetName&quot;;  however, if no such facet exists
 * (or &quot;facetName&quot; is null), and &quot;defaultFacet&quot; has been set, then
 * that facet will be used instead.   (It's possible to achieve this
 * same functionality by using a panelGroup and binding the
 * &quot;rendered&quot; property of each child, but this component can be
 * simpler.  Ordinary children of the switcher component are not rendered at
 * all.)
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
public class UIXSwitcher extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey FACET_NAME_KEY =
    TYPE.registerKey("facetName", String.class);
  static public final PropertyKey DEFAULT_FACET_KEY =
    TYPE.registerKey("defaultFacet", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Switcher";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Switcher";

  /**
   * Construct an instance of the UIXSwitcher.
   */
  public UIXSwitcher()
  {
    super(null);
  }
  
  /**
   * Only decode the currently active facet.
   */
  @Override
  public void processDecodes(FacesContext context)
  {
    UIComponent facet = _getFacet();
    if (facet != null)
      facet.processDecodes(context);
  }

  /**
   * Only process validations on the currently active facet.
   */
  @Override
  public void processValidators(FacesContext context)
  {
    UIComponent facet = _getFacet();
    if (facet != null)
      facet.processValidators(context);
  }


  /**
   * Only process updates on the currently active facet.
   */
  @Override
  public void processUpdates(FacesContext context)
  {
    UIComponent facet = _getFacet();
    if (facet != null)
      facet.processUpdates(context);
  }


  /**
   * Only render the currently active facet.
   */
  @Override
  public void encodeChildren(FacesContext context)
    throws IOException
  {
    UIComponent facet = _getFacet();
    if (facet != null)
      __encodeRecursive(context, facet);
  }


  /**
   * Override to return true.
   */
  @Override
  public boolean getRendersChildren()
  {
    return true;
  }

  private UIComponent _getFacet()
  {
    if (!isRendered())
      return null;

    String facetName = getFacetName();
    if (facetName != null)
    {
      UIComponent facet = getFacet(facetName);
      if (facet != null)
        return facet;
    }

    String defaultFacet = getDefaultFacet();
    if (defaultFacet != null)
      return getFacet(defaultFacet);

    return null;
  }


  /**
   * Gets the name of the facet to render and process.
   *
   * @return  the new facetName value
   */
  final public String getFacetName()
  {
    return ComponentUtils.resolveString(getProperty(FACET_NAME_KEY));
  }

  /**
   * Sets the name of the facet to render and process.
   * 
   * @param facetName  the new facetName value
   */
  final public void setFacetName(String facetName)
  {
    setProperty(FACET_NAME_KEY, (facetName));
  }

  /**
   * Gets the name of the facet to render and process if "facetName"
   *               is null or otherwise does not refer to an existing facet.
   *
   * @return  the new defaultFacet value
   */
  final public String getDefaultFacet()
  {
    return ComponentUtils.resolveString(getProperty(DEFAULT_FACET_KEY));
  }

  /**
   * Sets the name of the facet to render and process if "facetName"
   *               is null or otherwise does not refer to an existing facet.
   * 
   * @param defaultFacet  the new defaultFacet value
   */
  final public void setDefaultFacet(String defaultFacet)
  {
    setProperty(DEFAULT_FACET_KEY, (defaultFacet));
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
   * Construct an instance of the UIXSwitcher.
   */
  protected UIXSwitcher(
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
