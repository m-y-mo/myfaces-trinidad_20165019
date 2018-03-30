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
package org.apache.myfaces.trinidad.component.core.nav;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXCommand;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *           The commandLink control creates a link representation of a UIXCommand.
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
 * <td valign="top"><code>javax.faces.event.ActionEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered when the "action" of the component has been
invoked;  for example, by clicking on a button.  The action may result
in page navigation.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.ReturnEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values</td>
 * <td valign="top">Event delivered when the dialog has completed successfully.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.LaunchEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to prompt the command to launch a dialog.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreCommandLink extends UIXCommand
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXCommand.TYPE);
  static public final PropertyKey TEXT_KEY =
    TYPE.registerKey("text", String.class);
  static public final PropertyKey DISABLED_KEY =
    TYPE.registerKey("disabled", Boolean.class, Boolean.FALSE);
  static public final PropertyKey ACCESS_KEY_KEY =
    TYPE.registerKey("accessKey", Character.class);
  static public final PropertyKey PARTIAL_SUBMIT_KEY =
    TYPE.registerKey("partialSubmit", Boolean.class, Boolean.FALSE);
  static public final PropertyKey BLOCKING_KEY =
    TYPE.registerKey("blocking", Boolean.class, Boolean.FALSE);
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
  static public final PropertyKey ONBLUR_KEY =
    TYPE.registerKey("onblur", String.class);
  static public final PropertyKey ONFOCUS_KEY =
    TYPE.registerKey("onfocus", String.class);
  static public final PropertyKey USE_WINDOW_KEY =
    TYPE.registerKey("useWindow", Boolean.class, Boolean.FALSE);
  static public final PropertyKey WINDOW_HEIGHT_KEY =
    TYPE.registerKey("windowHeight", Integer.class);
  static public final PropertyKey WINDOW_WIDTH_KEY =
    TYPE.registerKey("windowWidth", Integer.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Command";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreCommandLink";

  /**
   * Construct an instance of the CoreCommandLink.
   */
  public CoreCommandLink()
  {
    super("org.apache.myfaces.trinidad.Link");
  }

  /**
   * Gets the textual label of the link.
   *
   * @return  the new text value
   */
  final public String getText()
  {
    return ComponentUtils.resolveString(getProperty(TEXT_KEY));
  }

  /**
   * Sets the textual label of the link.
   * 
   * @param text  the new text value
   */
  final public void setText(String text)
  {
    setProperty(TEXT_KEY, (text));
  }

  /**
   * Gets whether the link should be considered disabled.
   *               This attribute only has meaning when links are used in certain
   *               container types, such as global headers and tab bars.
   *
   * @return  the new disabled value
   */
  final public boolean isDisabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISABLED_KEY), false);
  }

  /**
   * Sets whether the link should be considered disabled.
   *               This attribute only has meaning when links are used in certain
   *               container types, such as global headers and tab bars.
   * 
   * @param disabled  the new disabled value
   */
  final public void setDisabled(boolean disabled)
  {
    setProperty(DISABLED_KEY, disabled ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets <html>
   *  Character used to gain quick access to this link.
   *               For accessibility reasons, this functionality is not 
   *               supported in screen reader mode.
   *               <p>
   *               If the same access key appears in multiple input fields in the 
   *               same page of output, the rendering user agent will cycle among 
   *               the elements accessed by the similar keys. Note that user agents 
   *               are inconsistent about dealing with two links having same access 
   *               key, and so the cycling behavior is dependent on what the user agent 
   *               provides.
   *               </p><p>
   *                 This attribute is sometimes referred to as the "mnemonic".
   *               </p><p>
   *                 The character specified by this attribute
   *                 <strong>must</strong> exist in the
   *                 <code>Text</code> attribute of this Link instance.
   *                 If it does not, the user will receive no visual indication of
   *                 the existence of the accessKey.
   *                 </p></html>
   *
   * @return  the new accessKey value
   */
  final public char getAccessKey()
  {
    return ComponentUtils.resolveCharacter((Character)getProperty(ACCESS_KEY_KEY));
  }

  /**
   * Sets <html>
   *  Character used to gain quick access to this link.
   *               For accessibility reasons, this functionality is not 
   *               supported in screen reader mode.
   *               <p>
   *               If the same access key appears in multiple input fields in the 
   *               same page of output, the rendering user agent will cycle among 
   *               the elements accessed by the similar keys. Note that user agents 
   *               are inconsistent about dealing with two links having same access 
   *               key, and so the cycling behavior is dependent on what the user agent 
   *               provides.
   *               </p><p>
   *                 This attribute is sometimes referred to as the "mnemonic".
   *               </p><p>
   *                 The character specified by this attribute
   *                 <strong>must</strong> exist in the
   *                 <code>Text</code> attribute of this Link instance.
   *                 If it does not, the user will receive no visual indication of
   *                 the existence of the accessKey.
   *                 </p></html>
   * 
   * @param accessKey  the new accessKey value
   */
  final public void setAccessKey(char accessKey)
  {
    setProperty(ACCESS_KEY_KEY, Character.valueOf(accessKey));
  }

  /**
   * Gets whether the action should be done through a partial page submit
   *             or not.
   *             Default is false: no partial page submit.
   *
   * @return  the new partialSubmit value
   */
  final public boolean isPartialSubmit()
  {
    return ComponentUtils.resolveBoolean(getProperty(PARTIAL_SUBMIT_KEY), false);
  }

  /**
   * Sets whether the action should be done through a partial page submit
   *             or not.
   *             Default is false: no partial page submit.
   * 
   * @param partialSubmit  the new partialSubmit value
   */
  final public void setPartialSubmit(boolean partialSubmit)
  {
    setProperty(PARTIAL_SUBMIT_KEY, partialSubmit ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets If set to TRUE the component will start blocking user input when the
   *      action is initiated. The blocking will stop when a response is received
   *      from the server.
   *
   * @return  the new blocking value
   */
  final public boolean isBlocking()
  {
    return ComponentUtils.resolveBoolean(getProperty(BLOCKING_KEY), false);
  }

  /**
   * Sets If set to TRUE the component will start blocking user input when the
   *      action is initiated. The blocking will stop when a response is received
   *      from the server.
   * 
   * @param blocking  the new blocking value
   */
  final public void setBlocking(boolean blocking)
  {
    setProperty(BLOCKING_KEY, blocking ? Boolean.TRUE : Boolean.FALSE);
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
   * Gets the event handler for the component losing the focus.
   *
   * @return  the new onblur value
   */
  final public String getOnblur()
  {
    return ComponentUtils.resolveString(getProperty(ONBLUR_KEY));
  }

  /**
   * Sets the event handler for the component losing the focus.
   * 
   * @param onblur  the new onblur value
   */
  final public void setOnblur(String onblur)
  {
    setProperty(ONBLUR_KEY, (onblur));
  }

  /**
   * Gets the event handler for the component gaining the focus.
   *
   * @return  the new onfocus value
   */
  final public String getOnfocus()
  {
    return ComponentUtils.resolveString(getProperty(ONFOCUS_KEY));
  }

  /**
   * Sets the event handler for the component gaining the focus.
   * 
   * @param onfocus  the new onfocus value
   */
  final public void setOnfocus(String onfocus)
  {
    setProperty(ONFOCUS_KEY, (onfocus));
  }

  /**
   * Gets Indicates whether processes launched by this command should be
   *         launched in a secondary dialog window. 'useWindow' requires that the "action"
   *         attribute start with "dialog:". Set useWindow to 'false' for the outcome of
   *         the action to be targeted to the existing window.
   *
   * @return  the new useWindow value
   */
  final public boolean isUseWindow()
  {
    return ComponentUtils.resolveBoolean(getProperty(USE_WINDOW_KEY), false);
  }

  /**
   * Sets Indicates whether processes launched by this command should be
   *         launched in a secondary dialog window. 'useWindow' requires that the "action"
   *         attribute start with "dialog:". Set useWindow to 'false' for the outcome of
   *         the action to be targeted to the existing window.
   * 
   * @param useWindow  the new useWindow value
   */
  final public void setUseWindow(boolean useWindow)
  {
    setProperty(USE_WINDOW_KEY, useWindow ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets Height of the window, if this command is used to launch a window.
   *
   * @return  the new windowHeight value
   */
  final public int getWindowHeight()
  {
    return ComponentUtils.resolveInteger(getProperty(WINDOW_HEIGHT_KEY));
  }

  /**
   * Sets Height of the window, if this command is used to launch a window.
   * 
   * @param windowHeight  the new windowHeight value
   */
  final public void setWindowHeight(int windowHeight)
  {
    setProperty(WINDOW_HEIGHT_KEY, Integer.valueOf(windowHeight));
  }

  /**
   * Gets Width of the window, if this command is used to launch a window.
   *
   * @return  the new windowWidth value
   */
  final public int getWindowWidth()
  {
    return ComponentUtils.resolveInteger(getProperty(WINDOW_WIDTH_KEY));
  }

  /**
   * Sets Width of the window, if this command is used to launch a window.
   * 
   * @param windowWidth  the new windowWidth value
   */
  final public void setWindowWidth(int windowWidth)
  {
    setProperty(WINDOW_WIDTH_KEY, Integer.valueOf(windowWidth));
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
   * Construct an instance of the CoreCommandLink.
   */
  protected CoreCommandLink(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Command","org.apache.myfaces.trinidad.Link");
  }
}
