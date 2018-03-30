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
import org.apache.myfaces.trinidad.component.UIXSelectMany;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The selectManyShuttle component provides a mechanism for selecting
 *    multiple values from a list of values by allowing the user to move
 *    items between two lists.  The &quot;value&quot; attribute of the selectManyShuttle,
 *    like any other selectMany component, must be a List or array of values
 *    that correspond to a value of one of the contained SelectItems.  If a
 *    value of one of the SelectItems is in the List or array, that item
 *    will appear in the trailing list.  Looked at another way, you can
 *    change a selectManyListbox directly into a selectManyShuttle;  instead
 *    of the &quot;value&quot; driving which items are selected in the listbox, it
 *    affects which items appear in the trailing list of the shuttle.
 *          <html:p>
 *   The selectManyShuttle does not allow for reordering;
 *   the selectOrderShuttle component adds this functionality
 *   to selectManyShuttle.  selectManyShuttle also does not include
 *   automatic messaging support, unlike most other Trinidad messaging
 *   components.
 *          </html:p>
 *           <section name="Attributes">
 *             <html:p>
 *               Each list in the shuttle has a header, the
 *               text of which can be set as the &quot;leadingHeader&quot; attribute
 *               and the &quot;trailingHeader&quot; attribute.
 *             </html:p>
 *             <html:p>
 *               Each container in the shuttle can have an area to display item
 *               descriptions below the list. To indicate whether or not
 *               a container should have such an area set the attributes
 *               <html:code>&quot;leadingDescShown&quot;</html:code> attribute
 *               and the <html:code>&quot;trailingDescShown&quot;</html:code> attribute.
 *             </html:p>
 *             <html:p>
 *               To control the display size(number of items) of the lists, the
 *               size attribute has to be specified. The size specified must be
 *               between 10 and 20 items. If the attribute is not set or has a
 *               value less than 10, the size would have a default or minimum
 *               value of 10. If the attribute value specified is more than 20 items,
 *               the size would have the maximum value of 20.
 *             </html:p>
 *           </section>
 * 
 *           <section name="Shuttle Footers">
 *             <html:p>
 *               The shuttle allows the user to place components - typically,
 *        buttons or icons - below each of the lists.  These
 *               buttons or icons will take up only one row below the lists
 *               (no wrapping), and should have a maximum height of 26 pixels
 *               if the layout of the shuttle is to remain consistent.  The
 *               buttons and icons should be placed within the
 *               shuttle as the <html:code>leadingFooter</html:code>
 *               or the <html:code>trailingFooter</html:code> facet,
 *               depending on which list the buttons should go under.
 *               Leave the appropriate facet empty if no footer is
 *               required under a list.  These buttons and icons can be
 *               used to perform operations upon the shuttle using a
 *               ShuttleProxy as described below.
 *             </html:p>
 *           </section>
 *           <section name="Shuttle Filter">
 *             <html:p>
 *               The shuttle allows the user to place a filter above the
 *               list in the leading container. The filter is added as the
 *        <html:code>filter</html:code> facet.  The filter can be used to
 *        perform operations upon the shuttle using a ShuttleProxy as
 *        described below.
 *             </html:p>
 *           </section>
 * 
 *           <section name="JavaScript proxies">
 *             <html:p>
 *               In some cases, developers will need to use JavaScript to
 *               manipulate or use the contents of the lists.  This may be
 *               required as actions for the buttons or icons in the
 *               shuttle footers or outside the shuttle all together. Thus,
 *               a set of Javascript utility methods are available that
 *               operate on the lists.  These are located in the shuttle.js
 *               Javascript library, which is automatically loaded if you
 *               use the shuttle.
 *             </html:p>
 *             <html:p>
 *               These methods can be accessed by creating a
 *               <html:code>ShuttleProxy</html:code> instance based on the
 *               shuttle client ID and form.
 *               <html:pre>
 *                 // create the proxy object
 *                 var proxy2 = new ShuttleProxy(&quot;testShuttle2&quot;, &quot;testForm2&quot;);
 *               </html:pre>
 *             </html:p>
 *             <html:p>
 *               Once the proxy is created, you can use it to gain
 *               information about the lists or to manipulate the lists in
 *               the shuttle.  The proxy provides the following functions:
 * 
 *               <html:ul>
 * 
 *                 <html:li><html:code>move(fromLeadingList, allItems)</html:code> : moves items from
 *                   one list to the other.  If <html:code>fromLeadingList</html:code> is true, the items
 *                   move from the leading list to the trailing list.  If
 *                   <html:code>fromLeadingList</html:code> is false, the items move the opposite
 *                   direction.  If <html:code>allItems</html:code> is true, all the items are moved,
 *                   otherwise only the selected items are moved.</html:li>
 * 
 *                 <html:li><html:code>reorderList(down, allTheWay, leadingList)</html:code> : reorders
 *                   a list.  If <html:code>down</html:code> is true, the items move down in the list,
 *                   otherwise they move up.  If <html:code>allTheWay</html:code> is true, the items move
 *                   all the way to the top or bottom of the list depending on the value of
 *                   <html:code>down</html:code>.  If <html:code>leadingList</html:code> is true, the leading list
 *                   is reordered, otherwise the trailing list is reordered.</html:li>
 * 
 *                 <html:li><html:code>getItems(leadingList)</html:code> : returns an array of
 *                   <html:code>option</html:code> objects that make up a list.  If <html:code>leadingList</html:code>
 *                   is true, the array has the leading list's options, otherwise the items
 *                   are from the trailing list.  Note that the array will not include the
 *                   horizontal bar at the end of the lists.</html:li>
 * 
 *                 <html:li><html:code>getSelectedItems(leadingList)</html:code> : returns an array of
 *                   <html:code>option</html:code> objects that are selected in a list.  If
 *                   <html:code>leadingList</html:code> is true, the array has the leading list's options,
 *                   otherwise the items are from the trailingList.  Note that the array will not
 *                   include the horizontal bar at the end of the lists.</html:li>
 * 
 *                 <html:li><html:code>getItemCount(leadingList)</html:code> : returns the number of
 *                   items in a list.  If <html:code>leadingList</html:code> is true, the number returned
 *                   is the number of items in the leading list.  Otherwise, the number returned
 *                   is the number of items in the trailing list.  Note that the horizontal bar
 *                   at the end of the lists is not included in this count -- you only get the
 *                   number of actual items.</html:li>
 * 
 *                 <html:li><html:code>getSelectedItemCount(leadingList)</html:code> : returns the number
 *                   of selected items in a list.  If <html:code>leadingList</html:code> is true, the
 *                   number returned is the number of selected items in the leading list.
 *                   Otherwise, the number returned is the number of selected items in the
 *                   trailing list.  Note that the horizontal bar at the end of the lists is not
 *                   included in this count -- you only get the number of actual items.</html:li>
 * 
 *                 <html:li><html:code>addItem(leadingList, index, text, value, description)</html:code> : adds an item
 *                   at the given index to a list.  The item is added to the leading list if
 *                   <html:code>leadingList</html:code> is true, otherwise it is added to the trailing list.
 *                   The <html:code>index</html:code> should be 0 based.  Thus, to insert an item at
 *                   the end of a list, set <html:code>index</html:code> to
 *                   <html:code>shuttleProxy.getItemCount(leadinglist)</html:code>.  The <html:code>text</html:code>
 *                   parameter specifies the display text for the item, while the
 *                   <html:code>value</html:code> parameter specifies the value that represents this item
 *                   upon form submission. The <html:code>description</html:code> parameter specifies a
 *                   description of the item. The <html:code>description</html:code> parameter can be omitted.</html:li>
 * 
 *                 <html:li><html:code>deleteItemByValue(leadingList, value)</html:code> :
 *                   deletes an item
 *                   from a list.  The item is deleted from the leading list if
 *                   <html:code>leadingList</html:code> is true, otherwise it is deleted from the trailing
 *                   list.  The item deleted is the first item with the value (not text) of
 *                   <html:code>value</html:code>.</html:li>
 * 
 *                 <html:li><html:code>deleteSelectedItems(leadingList)</html:code> : deletes items
 *                   from a list.  The items are deleted from the leading list if
 *                   <html:code>leadingList</html:code> is true, otherwise they are deleted from the
 *                   trailing list.  The items deleted are the items that are selected in the
 *                   appropriate list.</html:li>
 * 
 *                 <html:li><html:code>reset()</html:code> : reset the shuttle
 *                   to its initial state.</html:li>
 * 
 *               </html:ul>
 * 
 *             </html:p>
 * 
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
public class CoreSelectManyShuttle extends UIXSelectMany
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXSelectMany.TYPE);
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
    "org.apache.myfaces.trinidad.SelectMany";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreSelectManyShuttle";

  /**
   * Construct an instance of the CoreSelectManyShuttle.
   */
  public CoreSelectManyShuttle()
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
   * Construct an instance of the CoreSelectManyShuttle.
   */
  protected CoreSelectManyShuttle(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectMany","org.apache.myfaces.trinidad.Shuttle");
  }
}
