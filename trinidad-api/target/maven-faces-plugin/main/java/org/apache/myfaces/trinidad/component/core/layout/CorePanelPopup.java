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
 * <html:p>
 * The panelPopup is used to place ancillary information on a page, made visible via a clickable link (e.g icon or link).
 * </html:p>
 * <html:p>
 * The text attribute or 'trigger' facet is used to define the clickable area of the page.  When clicked a floating panel is made visible
 * containing the child components. If the title attribute is present, then a title bar (including the title) will be
 * rendered for the popup panel.
 * </html:p>
 * <html:p>
 * The position attribute of popupPanel can be used to control the location of the panel when visible.
 * </html:p>
 * <html:p>
 *   You can make changes to the style of the content region of this component by
 *   adding your custom styles to the contentStyle attribute.
 * </html:p>
 * <html:p>
 *   Content containers will generally have only one child with the actual
 *   contents as its children. This child will describe how the content should be
 *   displayed.  However, the content container can have multiple children, in
 *   which case the children are displayed in a stack fashion, lined up
 *   vertically.
 * </html:p>
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
public class CorePanelPopup extends UIXPanel
{
  static public final String TRIGGER_TYPE_CLICK = "click";
  static public final String TRIGGER_TYPE_HOVER = "hover";
  static public final String POSITION_RELATIVE = "relative";
  static public final String POSITION_CENTERED = "centered";
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
  static public final PropertyKey TRIGGER_TYPE_KEY =
    TYPE.registerKey("triggerType", String.class, "click");
  static public final PropertyKey ICON_KEY =
    TYPE.registerKey("icon", String.class);
  static public final PropertyKey TEXT_KEY =
    TYPE.registerKey("text", String.class);
  static public final PropertyKey TITLE_KEY =
    TYPE.registerKey("title", String.class);
  static public final PropertyKey MODAL_KEY =
    TYPE.registerKey("modal", Boolean.class, Boolean.FALSE);
  static public final PropertyKey POSITION_KEY =
    TYPE.registerKey("position", String.class, "relative");
  static public final PropertyKey XOFFSET_KEY =
    TYPE.registerKey("xoffset", Integer.class, Integer.valueOf(0));
  static public final PropertyKey YOFFSET_KEY =
    TYPE.registerKey("yoffset", Integer.class, Integer.valueOf(0));
  static public final PropertyKey CONTENT_STYLE_KEY =
    TYPE.registerKey("contentStyle", String.class);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", Integer.class, Integer.valueOf(0));
  static public final PropertyKey HEIGHT_KEY =
    TYPE.registerKey("height", Integer.class, Integer.valueOf(0));
  static public final String TRIGGER_FACET = "trigger";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Panel";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CorePanelPopup";

  /**
   * Construct an instance of the CorePanelPopup.
   */
  public CorePanelPopup()
  {
    super("org.apache.myfaces.trinidad.Popup");
  }

  /**
   * Content to be rendered as a link to launch the popup panel. Use this facet
   *         to define an icon or other content types to launch the popup. If this facet  is not defined, then
   *         the 'text' attribute must be specified.
   */
  final public UIComponent getTrigger()
  {
    return getFacet(TRIGGER_FACET);
  }

  /**
   * Content to be rendered as a link to launch the popup panel. Use this facet
   *         to define an icon or other content types to launch the popup. If this facet  is not defined, then
   *         the 'text' attribute must be specified.
   */
  @SuppressWarnings("unchecked")
  final public void setTrigger(UIComponent triggerFacet)
  {
    getFacets().put(TRIGGER_FACET, triggerFacet);
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
   * Gets Defines the launch behaviour of the popup.  If set to 'click' the popup will
   *         appear when the trigger is clicked, and disappear when you click off the popup.  The 'hover' value
   *         will cause the popup to appear while the mouse is over the trigger, and disappear when the mouse
   *         leaves either the trigger or the popup panel.
   *
   * @return  the new triggerType value
   */
  final public String getTriggerType()
  {
    return ComponentUtils.resolveString(getProperty(TRIGGER_TYPE_KEY), "click");
  }

  /**
   * Sets Defines the launch behaviour of the popup.  If set to 'click' the popup will
   *         appear when the trigger is clicked, and disappear when you click off the popup.  The 'hover' value
   *         will cause the popup to appear while the mouse is over the trigger, and disappear when the mouse
   *         leaves either the trigger or the popup panel.
   * 
   * @param triggerType  the new triggerType value
   */
  final public void setTriggerType(String triggerType)
  {
    setProperty(TRIGGER_TYPE_KEY, (triggerType));
  }

  /**
   * Gets The icon to render as a link to launch the popup panel.  If the 'trigger'
   *         facet is defined, then this attribute is ignored.  If the 'text' attribute is also specified,
   *         then the icon and text will both be rendered.
   *
   * @return  the new icon value
   */
  final public String getIcon()
  {
    return ComponentUtils.resolveString(getProperty(ICON_KEY));
  }

  /**
   * Sets The icon to render as a link to launch the popup panel.  If the 'trigger'
   *         facet is defined, then this attribute is ignored.  If the 'text' attribute is also specified,
   *         then the icon and text will both be rendered.
   * 
   * @param icon  the new icon value
   */
  final public void setIcon(String icon)
  {
    setProperty(ICON_KEY, (icon));
  }

  /**
   * Gets The text to render as a link to launch the popup panel.  If the 'trigger'
   *         facet is defined, then this attribute is ignored.
   *
   * @return  the new text value
   */
  final public String getText()
  {
    return ComponentUtils.resolveString(getProperty(TEXT_KEY));
  }

  /**
   * Sets The text to render as a link to launch the popup panel.  If the 'trigger'
   *         facet is defined, then this attribute is ignored.
   * 
   * @param text  the new text value
   */
  final public void setText(String text)
  {
    setProperty(TEXT_KEY, (text));
  }

  /**
   * Gets The title of the panel when visible.  The titlebar is not rendered if this attribute
   *         is not specified.
   *
   * @return  the new title value
   */
  final public String getTitle()
  {
    return ComponentUtils.resolveString(getProperty(TITLE_KEY));
  }

  /**
   * Sets The title of the panel when visible.  The titlebar is not rendered if this attribute
   *         is not specified.
   * 
   * @param title  the new title value
   */
  final public void setTitle(String title)
  {
    setProperty(TITLE_KEY, (title));
  }

  /**
   * Gets The display mode of the panel.  Defaults to "false" (non-modal).
   *         Non-Modal panels will close when the user clicks off the panel. Modal popups are
   *         rendered with a titlebar and close icon.  Clicking the close icon will close the
   *         modal popup.
   *
   * @return  the new modal value
   */
  final public boolean isModal()
  {
    return ComponentUtils.resolveBoolean(getProperty(MODAL_KEY), false);
  }

  /**
   * Sets The display mode of the panel.  Defaults to "false" (non-modal).
   *         Non-Modal panels will close when the user clicks off the panel. Modal popups are
   *         rendered with a titlebar and close icon.  Clicking the close icon will close the
   *         modal popup.
   * 
   * @param modal  the new modal value
   */
  final public void setModal(boolean modal)
  {
    setProperty(MODAL_KEY, modal ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets The position of the content container when visible. Defaults to
   *          "relative" if not specified. Other values are "centered" (centered on screen).
   *
   * @return  the new position value
   */
  final public String getPosition()
  {
    return ComponentUtils.resolveString(getProperty(POSITION_KEY), "relative");
  }

  /**
   * Sets The position of the content container when visible. Defaults to
   *          "relative" if not specified. Other values are "centered" (centered on screen).
   * 
   * @param position  the new position value
   */
  final public void setPosition(String position)
  {
    setProperty(POSITION_KEY, (position));
  }

  /**
   * Gets The popup's horizontal offset in pixels from the current mouse position.
   *         This property only applies to popups using relative positioning.
   *
   * @return  the new xoffset value
   */
  final public int getXoffset()
  {
    return ComponentUtils.resolveInteger(getProperty(XOFFSET_KEY), 0);
  }

  /**
   * Sets The popup's horizontal offset in pixels from the current mouse position.
   *         This property only applies to popups using relative positioning.
   * 
   * @param xoffset  the new xoffset value
   */
  final public void setXoffset(int xoffset)
  {
    setProperty(XOFFSET_KEY, Integer.valueOf(xoffset));
  }

  /**
   * Gets The popup's vertical offset in pixels from the current mouse position.
   *         This property only applies to popups using relative positioning.
   *
   * @return  the new yoffset value
   */
  final public int getYoffset()
  {
    return ComponentUtils.resolveInteger(getProperty(YOFFSET_KEY), 0);
  }

  /**
   * Sets The popup's vertical offset in pixels from the current mouse position.
   *         This property only applies to popups using relative positioning.
   * 
   * @param yoffset  the new yoffset value
   */
  final public void setYoffset(int yoffset)
  {
    setProperty(YOFFSET_KEY, Integer.valueOf(yoffset));
  }

  /**
   * Gets The inline style of the content region.
   *
   * @return  the new contentStyle value
   */
  final public String getContentStyle()
  {
    return ComponentUtils.resolveString(getProperty(CONTENT_STYLE_KEY));
  }

  /**
   * Sets The inline style of the content region.
   * 
   * @param contentStyle  the new contentStyle value
   */
  final public void setContentStyle(String contentStyle)
  {
    setProperty(CONTENT_STYLE_KEY, (contentStyle));
  }

  /**
   * Gets Set the width of the popup.  If not present the width defaults to the width of the content.
   *
   * @return  the new width value
   */
  final public int getWidth()
  {
    return ComponentUtils.resolveInteger(getProperty(WIDTH_KEY), 0);
  }

  /**
   * Sets Set the width of the popup.  If not present the width defaults to the width of the content.
   * 
   * @param width  the new width value
   */
  final public void setWidth(int width)
  {
    setProperty(WIDTH_KEY, Integer.valueOf(width));
  }

  /**
   * Gets Set the height of the popup.  If not present the width defaults to the height of the content.
   *
   * @return  the new height value
   */
  final public int getHeight()
  {
    return ComponentUtils.resolveInteger(getProperty(HEIGHT_KEY), 0);
  }

  /**
   * Sets Set the height of the popup.  If not present the width defaults to the height of the content.
   * 
   * @param height  the new height value
   */
  final public void setHeight(int height)
  {
    setProperty(HEIGHT_KEY, Integer.valueOf(height));
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
   * Construct an instance of the CorePanelPopup.
   */
  protected CorePanelPopup(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Panel","org.apache.myfaces.trinidad.Popup");
  }
}
