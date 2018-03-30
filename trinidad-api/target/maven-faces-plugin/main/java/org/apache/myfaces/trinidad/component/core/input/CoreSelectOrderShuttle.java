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
import org.apache.myfaces.trinidad.component.UIXSelectOrder;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The selectOrderShuttle component provides a mechanism for selecting
 *    multiple values from a list of values by allowing the user to move
 *    items between two lists, and reordering that list of values.
 *           It includes all the functionality
 *           of selectManyShuttle, and has an equivalent API.  The only
 *           functional difference is that selectOrderShuttle will present the
 *           user with the ability to reorder the list of selected values,
 *           and will deliver <html:code>ValueChangeEvents</html:code> when
 *           the order changes. (selectMany components do not consider
 *           changes in order relevant to the value of that component.)  See
 *           the documentation for selectManyShuttle for further information
 *           on using the shuttle.
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
public class CoreSelectOrderShuttle extends UIXSelectOrder
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXSelectOrder.TYPE);
  static public final PropertyKey REORDER_ONLY_KEY =
    TYPE.registerKey("reorderOnly", Boolean.class, Boolean.FALSE);
  static public final PropertyKey VALUE_PASS_THRU_KEY =
    TYPE.registerKey("valuePassThru", Boolean.class, Boolean.FALSE);
  static public final PropertyKey READ_ONLY_KEY =
    TYPE.registerKey("readOnly", Boolean.class, Boolean.FALSE);
  static public final PropertyKey DISABLED_KEY =
    TYPE.registerKey("disabled", Boolean.class, Boolean.FALSE);
  static public final PropertyKey ONCHANGE_KEY =
    TYPE.registerKey("onchange", String.class);
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
  static public final PropertyKey SIZE_KEY =
    TYPE.registerKey("size", Integer.class);
  static public final PropertyKey LEADING_HEADER_KEY =
    TYPE.registerKey("leadingHeader", String.class);
  static public final PropertyKey TRAILING_HEADER_KEY =
    TYPE.registerKey("trailingHeader", String.class);
  static public final PropertyKey LEADING_DESC_SHOWN_KEY =
    TYPE.registerKey("leadingDescShown", Boolean.class, Boolean.FALSE);
  static public final PropertyKey TRAILING_DESC_SHOWN_KEY =
    TYPE.registerKey("trailingDescShown", Boolean.class, Boolean.FALSE);
  static public final PropertyKey LABEL_KEY =
    TYPE.registerKey("label", String.class);
  static public final String FILTER_FACET = "filter";
  static public final String LEADING_FOOTER_FACET = "leadingFooter";
  static public final String TRAILING_FOOTER_FACET = "trailingFooter";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectOrder";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreSelectOrderShuttle";

  /**
   * Construct an instance of the CoreSelectOrderShuttle.
   */
  public CoreSelectOrderShuttle()
  {
    super("org.apache.myfaces.trinidad.Shuttle");
  }

  /**
   * the filter above the leading list.
   */
  final public UIComponent getFilter()
  {
    return getFacet(FILTER_FACET);
  }

  /**
   * the filter above the leading list.
   */
  @SuppressWarnings("unchecked")
  final public void setFilter(UIComponent filterFacet)
  {
    getFacets().put(FILTER_FACET, filterFacet);
  }

  /**
   * the footer of buttons/images under the leading list.
   */
  final public UIComponent getLeadingFooter()
  {
    return getFacet(LEADING_FOOTER_FACET);
  }

  /**
   * the footer of buttons/images under the leading list.
   */
  @SuppressWarnings("unchecked")
  final public void setLeadingFooter(UIComponent leadingFooterFacet)
  {
    getFacets().put(LEADING_FOOTER_FACET, leadingFooterFacet);
  }

  /**
   * the footer of buttons/images under the trailing list.
   */
  final public UIComponent getTrailingFooter()
  {
    return getFacet(TRAILING_FOOTER_FACET);
  }

  /**
   * the footer of buttons/images under the trailing list.
   */
  @SuppressWarnings("unchecked")
  final public void setTrailingFooter(UIComponent trailingFooterFacet)
  {
    getFacets().put(TRAILING_FOOTER_FACET, trailingFooterFacet);
  }

  /**
   * Gets whether the shuttle is in "reorder only" mode, where the user can reorder the list of values, but cannot add or remove them.
   *
   * @return  the new reorderOnly value
   */
  final public boolean isReorderOnly()
  {
    return ComponentUtils.resolveBoolean(getProperty(REORDER_ONLY_KEY), false);
  }

  /**
   * Sets whether the shuttle is in "reorder only" mode, where the user can reorder the list of values, but cannot add or remove them.
   * 
   * @param reorderOnly  the new reorderOnly value
   */
  final public void setReorderOnly(boolean reorderOnly)
  {
    setProperty(REORDER_ONLY_KEY, reorderOnly ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether or not the values are passed through to
   *         the client. When valuePassThru is false
   *         the value and the options' values
   *         are converted to indexes before being sent to the client.
   *         Therefore, when valuePassThru is false,
   *         there is no need to write your own converter when you are using custom Objects
   *         as your values and/or options.
   *         If you need to know the actual values on the client-side, then you can set
   *         valuePassThru to true. This will pass the values through to the client,
   *         using your custom converter if it is available; a custom converter is
   *         needed if you are using custom objects. The default is false.
   *
   * @return  the new valuePassThru value
   */
  final public boolean isValuePassThru()
  {
    return ComponentUtils.resolveBoolean(getProperty(VALUE_PASS_THRU_KEY), false);
  }

  /**
   * Sets whether or not the values are passed through to
   *         the client. When valuePassThru is false
   *         the value and the options' values
   *         are converted to indexes before being sent to the client.
   *         Therefore, when valuePassThru is false,
   *         there is no need to write your own converter when you are using custom Objects
   *         as your values and/or options.
   *         If you need to know the actual values on the client-side, then you can set
   *         valuePassThru to true. This will pass the values through to the client,
   *         using your custom converter if it is available; a custom converter is
   *         needed if you are using custom objects. The default is false.
   * 
   * @param valuePassThru  the new valuePassThru value
   */
  final public void setValuePassThru(boolean valuePassThru)
  {
    setProperty(VALUE_PASS_THRU_KEY, valuePassThru ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether the element is read-only.
   *
   * @return  the new readOnly value
   */
  final public boolean isReadOnly()
  {
    return ComponentUtils.resolveBoolean(getProperty(READ_ONLY_KEY), false);
  }

  /**
   * Sets whether the element is read-only.
   * 
   * @param readOnly  the new readOnly value
   */
  final public void setReadOnly(boolean readOnly)
  {
    setProperty(READ_ONLY_KEY, readOnly ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether the element is disabled.
   *
   * @return  the new disabled value
   */
  final public boolean isDisabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISABLED_KEY), false);
  }

  /**
   * Sets whether the element is disabled.
   * 
   * @param disabled  the new disabled value
   */
  final public void setDisabled(boolean disabled)
  {
    setProperty(DISABLED_KEY, disabled ? Boolean.TRUE : Boolean.FALSE);
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
   * Gets the display size(number of items) of the lists. The size
   *               specified must be between 10 and 20 items. If the attribute is not
   *               set or has a value less than 10, the size would have a default or
   *               minimum value of 10. If the attribute value specified is more than
   *               20 items, the size would have the maximum value of 20.
   *
   * @return  the new size value
   */
  final public int getSize()
  {
    return ComponentUtils.resolveInteger(getProperty(SIZE_KEY));
  }

  /**
   * Sets the display size(number of items) of the lists. The size
   *               specified must be between 10 and 20 items. If the attribute is not
   *               set or has a value less than 10, the size would have a default or
   *               minimum value of 10. If the attribute value specified is more than
   *               20 items, the size would have the maximum value of 20.
   * 
   * @param size  the new size value
   */
  final public void setSize(int size)
  {
    setProperty(SIZE_KEY, Integer.valueOf(size));
  }

  /**
   * Gets the header of the leading list of the shuttle.
   *
   * @return  the new leadingHeader value
   */
  final public String getLeadingHeader()
  {
    return ComponentUtils.resolveString(getProperty(LEADING_HEADER_KEY));
  }

  /**
   * Sets the header of the leading list of the shuttle.
   * 
   * @param leadingHeader  the new leadingHeader value
   */
  final public void setLeadingHeader(String leadingHeader)
  {
    setProperty(LEADING_HEADER_KEY, (leadingHeader));
  }

  /**
   * Gets the header of the trailing list of the shuttle.
   *
   * @return  the new trailingHeader value
   */
  final public String getTrailingHeader()
  {
    return ComponentUtils.resolveString(getProperty(TRAILING_HEADER_KEY));
  }

  /**
   * Sets the header of the trailing list of the shuttle.
   * 
   * @param trailingHeader  the new trailingHeader value
   */
  final public void setTrailingHeader(String trailingHeader)
  {
    setProperty(TRAILING_HEADER_KEY, (trailingHeader));
  }

  /**
   * Gets whether or not the leading list has an area to display descriptions.
   *
   * @return  the new leadingDescShown value
   */
  final public boolean isLeadingDescShown()
  {
    return ComponentUtils.resolveBoolean(getProperty(LEADING_DESC_SHOWN_KEY), false);
  }

  /**
   * Sets whether or not the leading list has an area to display descriptions.
   * 
   * @param leadingDescShown  the new leadingDescShown value
   */
  final public void setLeadingDescShown(boolean leadingDescShown)
  {
    setProperty(LEADING_DESC_SHOWN_KEY, leadingDescShown ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether or not the trailing list has an area to display descriptions.
   *
   * @return  the new trailingDescShown value
   */
  final public boolean isTrailingDescShown()
  {
    return ComponentUtils.resolveBoolean(getProperty(TRAILING_DESC_SHOWN_KEY), false);
  }

  /**
   * Sets whether or not the trailing list has an area to display descriptions.
   * 
   * @param trailingDescShown  the new trailingDescShown value
   */
  final public void setTrailingDescShown(boolean trailingDescShown)
  {
    setProperty(TRAILING_DESC_SHOWN_KEY, trailingDescShown ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the label for the shuttle that is used to identify the component only when displaying error messages. The label specified does not otherwise appear on the page.
   *
   * @return  the new label value
   */
  final public String getLabel()
  {
    return ComponentUtils.resolveString(getProperty(LABEL_KEY));
  }

  /**
   * Sets the label for the shuttle that is used to identify the component only when displaying error messages. The label specified does not otherwise appear on the page.
   * 
   * @param label  the new label value
   */
  final public void setLabel(String label)
  {
    setProperty(LABEL_KEY, (label));
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
   * Construct an instance of the CoreSelectOrderShuttle.
   */
  protected CoreSelectOrderShuttle(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectOrder","org.apache.myfaces.trinidad.Shuttle");
  }
}
