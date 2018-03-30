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
package org.apache.myfaces.trinidad.component.core.input;

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXInput;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <P>
 *           The inputFile component is a component that can
 *           be used to upload a file.  Any Trinidad form that contains this component
 *           must have usesUpload set to true.  The &quot;value&quot; property
 *           of an inputFile component will be set to an instance
 *           of the <html:code>org.apache.myfaces.trinidad.model.UploadedFile</html:code>
 *           class when a file is uploaded (with the appropriate
 *           <html:code>ValueChangeEvent</html:code> delivered.)  Before
 *           using this, developers must install the Apache Trinidad filter.
 *           </P>
 *           <P>
 *           The component supports custom converters to transform the <html:code>org.apache.myfaces.trinidad.model.UploadedFile</html:code>.
 *           To archive this, the the <html:code>getAsObject()</html:code> method is invoked, where the the <html:code>String</html:code> value
 *           is a key, which must be used to query the actual uploaded file from the request Map:
 *           </p>
 *           <pre>
 *   public Object getAsObject(FacesContext context, UIComponent component, String fileKey)
 *   {
 *     UploadedFile file = (UploadedFile)context.getExternalContext().getRequestMap().get(fileKey);
 *     // do transformation
 *     return file;
 *   }
 *           </pre>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ValueChangeEvent</code></td>
 * <td valign="top" nowrap>Process Validations<br>Apply Request Values</td>
 * <td valign="top">The valueChange event is delivered when the value
                       attribute is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreInputFile extends UIXInput
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXInput.TYPE);
  static public final PropertyKey CONTENT_STYLE_KEY =
    TYPE.registerKey("contentStyle", String.class);
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
  static public final PropertyKey ONCHANGE_KEY =
    TYPE.registerKey("onchange", String.class);
  static public final PropertyKey ONSELECT_KEY =
    TYPE.registerKey("onselect", String.class);
  static public final PropertyKey COLUMNS_KEY =
    TYPE.registerKey("columns", Integer.class);
  static public final PropertyKey SHOW_REQUIRED_KEY =
    TYPE.registerKey("showRequired", Boolean.class, Boolean.FALSE);
  static public final PropertyKey ACCESS_KEY_KEY =
    TYPE.registerKey("accessKey", Character.class);
  static public final PropertyKey DISABLED_KEY =
    TYPE.registerKey("disabled", Boolean.class, Boolean.FALSE);
  static public final PropertyKey LABEL_KEY =
    TYPE.registerKey("label", String.class);
  static public final PropertyKey SIMPLE_KEY =
    TYPE.registerKey("simple", Boolean.class, Boolean.FALSE);
  static public final String HELP_FACET = "help";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Input";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreInputFile";

  /**
   * Construct an instance of the CoreInputFile.
   */
  public CoreInputFile()
  {
    super("org.apache.myfaces.trinidad.File");
  }

  /**
   * This facet should contain field level help.
   */
  final public UIComponent getHelp()
  {
    return getFacet(HELP_FACET);
  }

  /**
   * This facet should contain field level help.
   */
  @SuppressWarnings("unchecked")
  final public void setHelp(UIComponent helpFacet)
  {
    getFacets().put(HELP_FACET, helpFacet);
  }

  /**
   * Gets the CSS styles to attach to the content of the component.  For example, you can set the width of that portion to 100 pixels by setting this attribute to "width: 100px".
   *
   * @return  the new contentStyle value
   */
  final public String getContentStyle()
  {
    return ComponentUtils.resolveString(getProperty(CONTENT_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to attach to the content of the component.  For example, you can set the width of that portion to 100 pixels by setting this attribute to "width: 100px".
   * 
   * @param contentStyle  the new contentStyle value
   */
  final public void setContentStyle(String contentStyle)
  {
    setProperty(CONTENT_STYLE_KEY, (contentStyle));
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
   * Gets event handler for when the value is changed.
   *
   * @return  the new onchange value
   */
  final public String getOnchange()
  {
    return ComponentUtils.resolveString(getProperty(ONCHANGE_KEY));
  }

  /**
   * Sets event handler for when the value is changed.
   * 
   * @param onchange  the new onchange value
   */
  final public void setOnchange(String onchange)
  {
    setProperty(ONCHANGE_KEY, (onchange));
  }

  /**
   * Gets event handler for when text becomes selected.
   *
   * @return  the new onselect value
   */
  final public String getOnselect()
  {
    return ComponentUtils.resolveString(getProperty(ONSELECT_KEY));
  }

  /**
   * Sets event handler for when text becomes selected.
   * 
   * @param onselect  the new onselect value
   */
  final public void setOnselect(String onselect)
  {
    setProperty(ONSELECT_KEY, (onselect));
  }

  /**
   * Gets The size of the text control specified by the number of characters shown.The default value depends on the browser.
   *
   * @return  the new columns value
   */
  final public int getColumns()
  {
    return ComponentUtils.resolveInteger(getProperty(COLUMNS_KEY));
  }

  /**
   * Sets The size of the text control specified by the number of characters shown.The default value depends on the browser.
   * 
   * @param columns  the new columns value
   */
  final public void setColumns(int columns)
  {
    setProperty(COLUMNS_KEY, Integer.valueOf(columns));
  }

  /**
   * Gets whether the associated control displays a visual indication of required user input. If a "required" attribute is also present, both the "required" attribute and the
   *           "showRequired" attribute must be false for the visual indication not to be displayed.
   *
   * @return  the new showRequired value
   */
  final public boolean isShowRequired()
  {
    return ComponentUtils.resolveBoolean(getProperty(SHOW_REQUIRED_KEY), false);
  }

  /**
   * Sets whether the associated control displays a visual indication of required user input. If a "required" attribute is also present, both the "required" attribute and the
   *           "showRequired" attribute must be false for the visual indication not to be displayed.
   * 
   * @param showRequired  the new showRequired value
   */
  final public void setShowRequired(boolean showRequired)
  {
    setProperty(SHOW_REQUIRED_KEY, showRequired ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets <html> For accessibility reasons, this functionality is not supported in screen reader mode. If the same access key appears in multiple locations in the same page of output, the rendering user agent will cycle among the elements accessed by the similar keys. <p> This attribute is sometimes referred to as the "mnemonic". </p></html>
   *
   * @return  the new accessKey value
   */
  final public char getAccessKey()
  {
    return ComponentUtils.resolveCharacter((Character)getProperty(ACCESS_KEY_KEY));
  }

  /**
   * Sets <html> For accessibility reasons, this functionality is not supported in screen reader mode. If the same access key appears in multiple locations in the same page of output, the rendering user agent will cycle among the elements accessed by the similar keys. <p> This attribute is sometimes referred to as the "mnemonic". </p></html>
   * 
   * @param accessKey  the new accessKey value
   */
  final public void setAccessKey(char accessKey)
  {
    setProperty(ACCESS_KEY_KEY, Character.valueOf(accessKey));
  }

  /**
   * Gets whether the component is disabled.
   *
   * @return  the new disabled value
   */
  final public boolean isDisabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISABLED_KEY), false);
  }

  /**
   * Sets whether the component is disabled.
   * 
   * @param disabled  the new disabled value
   */
  final public void setDisabled(boolean disabled)
  {
    setProperty(DISABLED_KEY, disabled ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the label of the bean.
   *
   * @return  the new label value
   */
  final public String getLabel()
  {
    return ComponentUtils.resolveString(getProperty(LABEL_KEY));
  }

  /**
   * Sets the label of the bean.
   * 
   * @param label  the new label value
   */
  final public void setLabel(String label)
  {
    setProperty(LABEL_KEY, (label));
  }

  /**
   * Gets a boolean value that controls whether the component
   * provides label and message support;  when set to "true", the component will
   * not display messaging support or the label (these attributes may be ignored: label,
   * labelAndAccessKey, accessKey, showRequired,
   * tip), and may use simpler layout primitives
   *
   * @return  the new simple value
   */
  final public boolean isSimple()
  {
    return ComponentUtils.resolveBoolean(getProperty(SIMPLE_KEY), false);
  }

  /**
   * Sets a boolean value that controls whether the component
   * provides label and message support;  when set to "true", the component will
   * not display messaging support or the label (these attributes may be ignored: label,
   * labelAndAccessKey, accessKey, showRequired,
   * tip), and may use simpler layout primitives
   * 
   * @param simple  the new simple value
   */
  final public void setSimple(boolean simple)
  {
    setProperty(SIMPLE_KEY, simple ? Boolean.TRUE : Boolean.FALSE);
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
   * Construct an instance of the CoreInputFile.
   */
  protected CoreInputFile(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Input","org.apache.myfaces.trinidad.File");
  }
}
