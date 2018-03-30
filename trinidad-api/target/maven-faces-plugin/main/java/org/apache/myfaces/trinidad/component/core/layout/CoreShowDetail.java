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
import org.apache.myfaces.trinidad.component.UIXShowDetail;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The showDetail provides a means of toggling a group of components between being
 * disclosed or undisclosed.  A showDetail should be used to:
 * <html:ul>
 *   <html:li>
 *     hide/show an entire section or a part of a section of information within the
 *     contents of a page such as:
 *   </html:li>
 *   <html:ul>
 *     <html:i>
 *       <html:li>show more information / hide more information</html:li>
 *       <html:li>show details / hide details</html:li>
 *       <html:li>
 *         show &quot;section name&quot; / hide &quot;section name&quot;
 *       </html:li>
 *       <html:li>show graph/hide graph, etc.</html:li>
 *     </html:i>
 *   </html:ul>
 *   <html:li>hide/show functionality such as:</html:li>
 *   <html:ul>
 *     <html:i>
 *       <html:li>simple/advance search</html:li>
 *     </html:i>
 *   </html:ul>
 *   <html:li>hide/show details of a table row</html:li>
 * </html:ul>
 * <html:p>
 *   On mobile devices the showDetail renders nothing itself, but does renders its
 *   children.
 * </html:p>
 * <section name="Appearance">
 *   If the &quot;disclosed&quot; property on the showDetail is set to false,  the
 *   an icon indicating that the item is not disclosed will be rendered and the
 *   &quot;prompt&quot; facet will be rendered next to the icon.  In this case
 *   the children of showDetail will not be rendered.  If the &quot;disclosed&quot;
 *   property  is set to false, the icon indicating that the item IS disclosed will
 *   be rendered and the and the &quot;prompt&quot; facet will be rendered next to
 *   the icon.  In this case, the children of showDetail WILL be rendered.
 *   <html:p>
 *     If the &quot;prompt&quot; facet is not present, but either the disclosedText
 *     or undisclosedText attributes are present (not both), the text in the attribute
 *     will appear next to the disclosure icon for both states.
 *   </html:p>
 *   <html:p>
 *     If the &quot;prompt&quot; facet is not present and both the disclosedText and
 *     or undisclosedText attributes are present , the text in the disclosedText
 *     attribute will appear when disclosed=&quot;true&quot; and the text in the
 *     undisclosedText attribute will appear when disclosed=&quot;false&quot;.
 *   </html:p>
 *   <html:p>
 *     Finally, if the &quot;prompt&quot; facet is not present and neither the
 *     disclosedText or undisclosedText attributes are present, then the word
 *     &quot;hide&quot; will appear next to the disclosure icon when
 *     disclosed=&quot;true&quot; and the word &quot;show&quot; will appear next
 *     to the disclosure icon when disclosed=&quot;false&quot;.  In this case both
 *     the &quot;hide&quot; and &quot;show&quot; labels will be links and mnd may
 *     be clicked in order to toggle the disclosure.
 *   </html:p>
 * </section>
 * <section name="Events">
 *   Clicking on the icon of the showDetail will deliver a <code>DisclosureEvent</code>
 *   to the server.  If a &quot;prompt&quot; facet is used, changing the value of the
 *   disclosed attribute on this component will also deliver the event.
 * </section>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.DisclosureEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The disclosure event is delivered when a node is
                       disclosed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreShowDetail extends UIXShowDetail
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXShowDetail.TYPE);
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
  static public final PropertyKey DISCLOSED_TEXT_KEY =
    TYPE.registerKey("disclosedText", String.class);
  static public final PropertyKey UNDISCLOSED_TEXT_KEY =
    TYPE.registerKey("undisclosedText", String.class);
  static public final String PROMPT_FACET = "prompt";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.ShowDetail";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreShowDetail";

  /**
   * Construct an instance of the CoreShowDetail.
   */
  public CoreShowDetail()
  {
    super("org.apache.myfaces.trinidad.ShowDetail");
  }

  /**
   * Component rendered next to the hide or show icon.  If this facet is present, this
   * will be used instead of the disclosedText and undisclosedText attributes.
   */
  final public UIComponent getPrompt()
  {
    return getFacet(PROMPT_FACET);
  }

  /**
   * Component rendered next to the hide or show icon.  If this facet is present, this
   * will be used instead of the disclosedText and undisclosedText attributes.
   */
  @SuppressWarnings("unchecked")
  final public void setPrompt(UIComponent promptFacet)
  {
    getFacets().put(PROMPT_FACET, promptFacet);
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
   * Gets the text to display when the children are disclosed.  If this attribute is set
   * and the undisclosedText attribute is not set, this text will be displayed for
   * both the disclosed state AND the undisclosed state.
   *
   * @return  the new disclosedText value
   */
  final public String getDisclosedText()
  {
    return ComponentUtils.resolveString(getProperty(DISCLOSED_TEXT_KEY));
  }

  /**
   * Sets the text to display when the children are disclosed.  If this attribute is set
   * and the undisclosedText attribute is not set, this text will be displayed for
   * both the disclosed state AND the undisclosed state.
   * 
   * @param disclosedText  the new disclosedText value
   */
  final public void setDisclosedText(String disclosedText)
  {
    setProperty(DISCLOSED_TEXT_KEY, (disclosedText));
  }

  /**
   * Gets the text to display when the children are undisclosed.  If this attribute is set
   * and the disclosedText attribute is not set, this text will be displayed for
   * both the disclosed state AND the undisclosed state.
   *
   * @return  the new undisclosedText value
   */
  final public String getUndisclosedText()
  {
    return ComponentUtils.resolveString(getProperty(UNDISCLOSED_TEXT_KEY));
  }

  /**
   * Sets the text to display when the children are undisclosed.  If this attribute is set
   * and the disclosedText attribute is not set, this text will be displayed for
   * both the disclosed state AND the undisclosed state.
   * 
   * @param undisclosedText  the new undisclosedText value
   */
  final public void setUndisclosedText(String undisclosedText)
  {
    setProperty(UNDISCLOSED_TEXT_KEY, (undisclosedText));
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
   * Construct an instance of the CoreShowDetail.
   */
  protected CoreShowDetail(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.ShowDetail","org.apache.myfaces.trinidad.ShowDetail");
  }
}
