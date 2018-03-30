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
package org.apache.myfaces.trinidad.component.core.layout;

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXPanel;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * PanelPage lays out an entire page.
 *         It supports several navigation and content areas for the creation of pages.
 *         When the panelPage is geometry managed, the last indexed child will be stretched vertically to fit in the leftover space not consumed by the other indexed children. If you do not want this stretching behavior, you must wrap your indexed children with a panelGroup with layout="vertical" and inlineStyle="overflow: auto;". This way, the panelGroup will be stretched to fit and scrollbars will appear when the content inside is larger than the allocated space.
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
public class CorePanelPage extends UIXPanel
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXPanel.TYPE);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey ONCLICK_KEY =
    TYPE.registerKey("onclick", String.class);
  static public final PropertyKey ONDBLCLICK_KEY =
    TYPE.registerKey("ondblclick", String.class);
  static public final PropertyKey ONMOUSEDOWN_KEY =
    TYPE.registerKey("onmousedown", String.class);
  static public final PropertyKey ONMOUSEUP_KEY =
    TYPE.registerKey("onmouseup", String.class);
  static public final PropertyKey ONMOUSEOVER_KEY =
    TYPE.registerKey("onmouseover", String.class);
  static public final PropertyKey ONMOUSEMOVE_KEY =
    TYPE.registerKey("onmousemove", String.class);
  static public final PropertyKey ONMOUSEOUT_KEY =
    TYPE.registerKey("onmouseout", String.class);
  static public final PropertyKey ONKEYPRESS_KEY =
    TYPE.registerKey("onkeypress", String.class);
  static public final PropertyKey ONKEYDOWN_KEY =
    TYPE.registerKey("onkeydown", String.class);
  static public final PropertyKey ONKEYUP_KEY =
    TYPE.registerKey("onkeyup", String.class);
  static public final PropertyKey AUXILIARY1SIZE_KEY =
    TYPE.registerKey("auxiliary1Size", Integer.class, Integer.valueOf(200));
  static public final PropertyKey AUXILIARY2SIZE_KEY =
    TYPE.registerKey("auxiliary2Size", Integer.class, Integer.valueOf(200));
  static public final PropertyKey AUXILIARY_GLOBAL_SIZE_KEY =
    TYPE.registerKey("auxiliaryGlobalSize", Integer.class, Integer.valueOf(200));
  static public final String APP_ABOUT_FACET = "appAbout";
  static public final String APP_COPYRIGHT_FACET = "appCopyright";
  static public final String APP_PRIVACY_FACET = "appPrivacy";
  static public final String BRANDING_FACET = "branding";
  static public final String INFO_FOOTNOTE_FACET = "infoFootnote";
  static public final String INFO_RETURN_FACET = "infoReturn";
  static public final String INFO_STATUS_FACET = "infoStatus";
  static public final String INFO_USER_FACET = "infoUser";
  static public final String LOCATION_FACET = "location";
  static public final String NAVIGATION1_FACET = "navigation1";
  static public final String NAVIGATION2_FACET = "navigation2";
  static public final String NAVIGATION3_FACET = "navigation3";
  static public final String NAVIGATION_GLOBAL_FACET = "navigationGlobal";
  static public final String SEARCH_FACET = "search";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Panel";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CorePanelPage";

  /**
   * Construct an instance of the CorePanelPage.
   */
  public CorePanelPage()
  {
    super("org.apache.myfaces.trinidad.Page");
  }

  /**
   * Area to put a commandLink to more information about the application.
   */
  final public UIComponent getAppAbout()
  {
    return getFacet(APP_ABOUT_FACET);
  }

  /**
   * Area to put a commandLink to more information about the application.
   */
  @SuppressWarnings("unchecked")
  final public void setAppAbout(UIComponent appAboutFacet)
  {
    getFacets().put(APP_ABOUT_FACET, appAboutFacet);
  }

  /**
   * The copyright region of the page.  If present, this area
   *                 typically contains an outputText with the copyright information.
   */
  final public UIComponent getAppCopyright()
  {
    return getFacet(APP_COPYRIGHT_FACET);
  }

  /**
   * The copyright region of the page.  If present, this area
   *                 typically contains an outputText with the copyright information.
   */
  @SuppressWarnings("unchecked")
  final public void setAppCopyright(UIComponent appCopyrightFacet)
  {
    getFacets().put(APP_COPYRIGHT_FACET, appCopyrightFacet);
  }

  /**
   * The privacy region of the page.  If present, this area
   *                 typically contains a commandLink to the privacy policy for the
   *                 application.
   */
  final public UIComponent getAppPrivacy()
  {
    return getFacet(APP_PRIVACY_FACET);
  }

  /**
   * The privacy region of the page.  If present, this area
   *                 typically contains a commandLink to the privacy policy for the
   *                 application.
   */
  @SuppressWarnings("unchecked")
  final public void setAppPrivacy(UIComponent appPrivacyFacet)
  {
    getFacets().put(APP_PRIVACY_FACET, appPrivacyFacet);
  }

  /**
   * The branding region of the page.  This section typically
   *                 contains a horizontal panelGroup for an image of a logo and an
   *                 outputText for a title.
   */
  final public UIComponent getBranding()
  {
    return getFacet(BRANDING_FACET);
  }

  /**
   * The branding region of the page.  This section typically
   *                 contains a horizontal panelGroup for an image of a logo and an
   *                 outputText for a title.
   */
  @SuppressWarnings("unchecked")
  final public void setBranding(UIComponent brandingFacet)
  {
    getFacets().put(BRANDING_FACET, brandingFacet);
  }

  /**
   * The footnote information region.  This region provides a location for
   *                 page-level information that is ancillary to the user's task.
   */
  final public UIComponent getInfoFootnote()
  {
    return getFacet(INFO_FOOTNOTE_FACET);
  }

  /**
   * The footnote information region.  This region provides a location for
   *                 page-level information that is ancillary to the user's task.
   */
  @SuppressWarnings("unchecked")
  final public void setInfoFootnote(UIComponent infoFootnoteFacet)
  {
    getFacets().put(INFO_FOOTNOTE_FACET, infoFootnoteFacet);
  }

  /**
   * The return information region. Typically this will contain a "return to [X]" link.
   */
  final public UIComponent getInfoReturn()
  {
    return getFacet(INFO_RETURN_FACET);
  }

  /**
   * The return information region. Typically this will contain a "return to [X]" link.
   */
  @SuppressWarnings("unchecked")
  final public void setInfoReturn(UIComponent infoReturnFacet)
  {
    getFacets().put(INFO_RETURN_FACET, infoReturnFacet);
  }

  /**
   * The status information region. This region
   *                 provides a location for page-level status that is important to
   *                 the user's task.
   */
  final public UIComponent getInfoStatus()
  {
    return getFacet(INFO_STATUS_FACET);
  }

  /**
   * The status information region. This region
   *                 provides a location for page-level status that is important to
   *                 the user's task.
   */
  @SuppressWarnings("unchecked")
  final public void setInfoStatus(UIComponent infoStatusFacet)
  {
    getFacets().put(INFO_STATUS_FACET, infoStatusFacet);
  }

  /**
   * The user information region.  This region provides a location for
   *                 presenting user sign-in and connection information.
   */
  final public UIComponent getInfoUser()
  {
    return getFacet(INFO_USER_FACET);
  }

  /**
   * The user information region.  This region provides a location for
   *                 presenting user sign-in and connection information.
   */
  @SuppressWarnings("unchecked")
  final public void setInfoUser(UIComponent infoUserFacet)
  {
    getFacets().put(INFO_USER_FACET, infoUserFacet);
  }

  /**
   * The locator region of the page.  If present, this section
   *                 typically contains either a processTrain, indicating the user's
   *                 location in a multistep process, or navigationPath, containing
   *                 links that will bring the user back to each of the parent
   *                 pages of a tree of pages that he has navigated down into.
   */
  final public UIComponent getLocation()
  {
    return getFacet(LOCATION_FACET);
  }

  /**
   * The locator region of the page.  If present, this section
   *                 typically contains either a processTrain, indicating the user's
   *                 location in a multistep process, or navigationPath, containing
   *                 links that will bring the user back to each of the parent
   *                 pages of a tree of pages that he has navigated down into.
   */
  @SuppressWarnings("unchecked")
  final public void setLocation(UIComponent locationFacet)
  {
    getFacets().put(LOCATION_FACET, locationFacet);
  }

  /**
   * This location typically contains tabs for the primary layer.
   */
  final public UIComponent getNavigation1()
  {
    return getFacet(NAVIGATION1_FACET);
  }

  /**
   * This location typically contains tabs for the primary layer.
   */
  @SuppressWarnings("unchecked")
  final public void setNavigation1(UIComponent navigation1Facet)
  {
    getFacets().put(NAVIGATION1_FACET, navigation1Facet);
  }

  /**
   * This location typically contains tabs for the secondary layer.
   */
  final public UIComponent getNavigation2()
  {
    return getFacet(NAVIGATION2_FACET);
  }

  /**
   * This location typically contains tabs for the secondary layer.
   */
  @SuppressWarnings("unchecked")
  final public void setNavigation2(UIComponent navigation2Facet)
  {
    getFacets().put(NAVIGATION2_FACET, navigation2Facet);
  }

  /**
   * An optional vertically oriented region of contexual components for the main content.  Often this contains a list or tree of links for deeper navigation structure than the global, primary, and secondary regions can provide.
   */
  final public UIComponent getNavigation3()
  {
    return getFacet(NAVIGATION3_FACET);
  }

  /**
   * An optional vertically oriented region of contexual components for the main content.  Often this contains a list or tree of links for deeper navigation structure than the global, primary, and secondary regions can provide.
   */
  @SuppressWarnings("unchecked")
  final public void setNavigation3(UIComponent navigation3Facet)
  {
    getFacets().put(NAVIGATION3_FACET, navigation3Facet);
  }

  /**
   * This section typically contains global application links or otherwise top level navigation structure links, e.g. "Home", "Preferences", "Help", and "Sign Out".
   */
  final public UIComponent getNavigationGlobal()
  {
    return getFacet(NAVIGATION_GLOBAL_FACET);
  }

  /**
   * This section typically contains global application links or otherwise top level navigation structure links, e.g. "Home", "Preferences", "Help", and "Sign Out".
   */
  @SuppressWarnings("unchecked")
  final public void setNavigationGlobal(UIComponent navigationGlobalFacet)
  {
    getFacets().put(NAVIGATION_GLOBAL_FACET, navigationGlobalFacet);
  }

  /**
   * The search region of the page.  Typically used for application or system-wide searches.
   */
  final public UIComponent getSearch()
  {
    return getFacet(SEARCH_FACET);
  }

  /**
   * The search region of the page.  Typically used for application or system-wide searches.
   */
  @SuppressWarnings("unchecked")
  final public void setSearch(UIComponent searchFacet)
  {
    getFacets().put(SEARCH_FACET, searchFacet);
  }

  /**
   * Gets the CSS styles to use for this component.
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to use for this component.
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
  }

  /**
   * Gets a CSS style class to use for this component.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets a CSS style class to use for this component.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  /**
   * Gets an onclick Javascript handler.
   *
   * @return  the new onclick value
   */
  final public String getOnclick()
  {
    return ComponentUtils.resolveString(getProperty(ONCLICK_KEY));
  }

  /**
   * Sets an onclick Javascript handler.
   * 
   * @param onclick  the new onclick value
   */
  final public void setOnclick(String onclick)
  {
    setProperty(ONCLICK_KEY, (onclick));
  }

  /**
   * Gets an ondblclick Javascript handler.
   *
   * @return  the new ondblclick value
   */
  final public String getOndblclick()
  {
    return ComponentUtils.resolveString(getProperty(ONDBLCLICK_KEY));
  }

  /**
   * Sets an ondblclick Javascript handler.
   * 
   * @param ondblclick  the new ondblclick value
   */
  final public void setOndblclick(String ondblclick)
  {
    setProperty(ONDBLCLICK_KEY, (ondblclick));
  }

  /**
   * Gets an onmousedown Javascript handler.
   *
   * @return  the new onmousedown value
   */
  final public String getOnmousedown()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEDOWN_KEY));
  }

  /**
   * Sets an onmousedown Javascript handler.
   * 
   * @param onmousedown  the new onmousedown value
   */
  final public void setOnmousedown(String onmousedown)
  {
    setProperty(ONMOUSEDOWN_KEY, (onmousedown));
  }

  /**
   * Gets an onmouseup Javascript handler.
   *
   * @return  the new onmouseup value
   */
  final public String getOnmouseup()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEUP_KEY));
  }

  /**
   * Sets an onmouseup Javascript handler.
   * 
   * @param onmouseup  the new onmouseup value
   */
  final public void setOnmouseup(String onmouseup)
  {
    setProperty(ONMOUSEUP_KEY, (onmouseup));
  }

  /**
   * Gets an onmouseover Javascript handler.
   *
   * @return  the new onmouseover value
   */
  final public String getOnmouseover()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOVER_KEY));
  }

  /**
   * Sets an onmouseover Javascript handler.
   * 
   * @param onmouseover  the new onmouseover value
   */
  final public void setOnmouseover(String onmouseover)
  {
    setProperty(ONMOUSEOVER_KEY, (onmouseover));
  }

  /**
   * Gets an onmousemove Javascript handler.
   *
   * @return  the new onmousemove value
   */
  final public String getOnmousemove()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEMOVE_KEY));
  }

  /**
   * Sets an onmousemove Javascript handler.
   * 
   * @param onmousemove  the new onmousemove value
   */
  final public void setOnmousemove(String onmousemove)
  {
    setProperty(ONMOUSEMOVE_KEY, (onmousemove));
  }

  /**
   * Gets an onmouseout Javascript handler.
   *
   * @return  the new onmouseout value
   */
  final public String getOnmouseout()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOUT_KEY));
  }

  /**
   * Sets an onmouseout Javascript handler.
   * 
   * @param onmouseout  the new onmouseout value
   */
  final public void setOnmouseout(String onmouseout)
  {
    setProperty(ONMOUSEOUT_KEY, (onmouseout));
  }

  /**
   * Gets an onkeypress Javascript handler.
   *
   * @return  the new onkeypress value
   */
  final public String getOnkeypress()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYPRESS_KEY));
  }

  /**
   * Sets an onkeypress Javascript handler.
   * 
   * @param onkeypress  the new onkeypress value
   */
  final public void setOnkeypress(String onkeypress)
  {
    setProperty(ONKEYPRESS_KEY, (onkeypress));
  }

  /**
   * Gets an onkeydown Javascript handler.
   *
   * @return  the new onkeydown value
   */
  final public String getOnkeydown()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYDOWN_KEY));
  }

  /**
   * Sets an onkeydown Javascript handler.
   * 
   * @param onkeydown  the new onkeydown value
   */
  final public void setOnkeydown(String onkeydown)
  {
    setProperty(ONKEYDOWN_KEY, (onkeydown));
  }

  /**
   * Gets an onkeyup Javascript handler.
   *
   * @return  the new onkeyup value
   */
  final public String getOnkeyup()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYUP_KEY));
  }

  /**
   * Sets an onkeyup Javascript handler.
   * 
   * @param onkeyup  the new onkeyup value
   */
  final public void setOnkeyup(String onkeyup)
  {
    setProperty(ONKEYUP_KEY, (onkeyup));
  }

  /**
   * Gets Specifies the number of pixels that the auxiliary1 content should consume (this is a width if the orientationis "start" or "end" or a height if the orientation is "bottom").
   *
   * @return  the new auxiliary1Size value
   */
  final public int getAuxiliary1Size()
  {
    return ComponentUtils.resolveInteger(getProperty(AUXILIARY1SIZE_KEY), 200);
  }

  /**
   * Sets Specifies the number of pixels that the auxiliary1 content should consume (this is a width if the orientationis "start" or "end" or a height if the orientation is "bottom").
   * 
   * @param auxiliary1Size  the new auxiliary1Size value
   */
  final public void setAuxiliary1Size(int auxiliary1Size)
  {
    setProperty(AUXILIARY1SIZE_KEY, Integer.valueOf(auxiliary1Size));
  }

  /**
   * Gets Specifies the number of pixels that the auxiliary2 content should consume (this is a width if the orientationis "start" or "end" or a height if the orientation is "bottom").
   *
   * @return  the new auxiliary2Size value
   */
  final public int getAuxiliary2Size()
  {
    return ComponentUtils.resolveInteger(getProperty(AUXILIARY2SIZE_KEY), 200);
  }

  /**
   * Sets Specifies the number of pixels that the auxiliary2 content should consume (this is a width if the orientationis "start" or "end" or a height if the orientation is "bottom").
   * 
   * @param auxiliary2Size  the new auxiliary2Size value
   */
  final public void setAuxiliary2Size(int auxiliary2Size)
  {
    setProperty(AUXILIARY2SIZE_KEY, Integer.valueOf(auxiliary2Size));
  }

  /**
   * Gets Specifies the number of pixels that the auxiliaryGlobal content should consume (this is a width if the orientationis "start" or "end" or a height if the orientation is "bottom").
   *
   * @return  the new auxiliaryGlobalSize value
   */
  final public int getAuxiliaryGlobalSize()
  {
    return ComponentUtils.resolveInteger(getProperty(AUXILIARY_GLOBAL_SIZE_KEY), 200);
  }

  /**
   * Sets Specifies the number of pixels that the auxiliaryGlobal content should consume (this is a width if the orientationis "start" or "end" or a height if the orientation is "bottom").
   * 
   * @param auxiliaryGlobalSize  the new auxiliaryGlobalSize value
   */
  final public void setAuxiliaryGlobalSize(int auxiliaryGlobalSize)
  {
    setProperty(AUXILIARY_GLOBAL_SIZE_KEY, Integer.valueOf(auxiliaryGlobalSize));
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
   * Construct an instance of the CorePanelPage.
   */
  protected CorePanelPage(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Panel","org.apache.myfaces.trinidad.Page");
  }
}
