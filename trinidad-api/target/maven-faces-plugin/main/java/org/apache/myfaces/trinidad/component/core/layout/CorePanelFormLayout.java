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
 *            The panelFormLayout lays out input form controls, such that their
 *            labels and fields line up vertically.  It supports multiple
 *            columns, and also supports a footer facet.
 *           </html:p>
 *           <html:p>
 *            Usually, this component will simply contain labelled Apache Trinidad input
 *            components in its main content - these are inputText, inputFile,
 *            inputColor, inputListOfValues, inputDate,
 *            selectBooleanCheckbox, selectBooleanRadio, selectOneChoice,
 *            selectOneListbox, selectOneRadio, selectManyCheckbox, and
 *            selectManyListbox.  These components must have
 *            their &quot;simple&quot; attribute set to false, which is the default,
 *            and will cause the labels and fields inside the panelFormLayout
 *            to be aligned vertically.
 *           </html:p>
 *           <html:p>
 *            When more complex field contents are needed, use
 *            a panelLabelAndMessage around the more complex contents
 *            needed;  see the example below.
 *           </html:p>
 *           <html:p>
 *            Other components can be added to panelFormLayout, but they
 *            will not line up with labels and fields automatically,
 *            and each will appear on its own row.
 *            You can use other panel components - like panelHorizontal -
 *            to get some level of layout within a row, but to align
 *            contents with the other labels and fields, use panelLabelAndMessage
 *            or the &quot;footer&quot; facet.
 *           </html:p>
 *           <html:p>
 *            The panelFormLayout is an example of one of the components that has support
 *            for grouping its children components.
 *            If you place panelFormLayout child items inside of a group, separators will
 *            be drawn around the group of form items if adjacent to other form items
 *            (separators won't be drawn at the top if the group is the first item in
 *            the column or, similarly, at the bottom if the group is the last item
 *            in the column).
 *            Grouped panelFormLayout items are kept in the same column of the panelFormLayout
 *            even when the assigned rows attribute is set to a value smaller than
 *            the number of items in the group.
 *            The panelFormLayout component also supports the group component in its footer
 *            facet so you can place more than one item in the footer.  You can even
 *            group footer items one additional time to get separators to appear.
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
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CorePanelFormLayout extends UIXPanel
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
  static public final PropertyKey FIELD_WIDTH_KEY =
    TYPE.registerKey("fieldWidth", String.class);
  static public final PropertyKey LABEL_WIDTH_KEY =
    TYPE.registerKey("labelWidth", String.class);
  static public final PropertyKey MAX_COLUMNS_KEY =
    TYPE.registerKey("maxColumns", Integer.class);
  static public final PropertyKey ROWS_KEY =
    TYPE.registerKey("rows", Integer.class);
  static public final String FOOTER_FACET = "footer";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Panel";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CorePanelFormLayout";

  /**
   * Construct an instance of the CorePanelFormLayout.
   */
  public CorePanelFormLayout()
  {
    super("org.apache.myfaces.trinidad.FormLayout");
  }

  /**
   * This facet is rendered under the columns and usually contains a panelButtonBar.
   *              <p>
   * This facet may not always line up perfectly, especially if the labels or fields are longer than expected.  Try adjusting things with the labelWidth and fieldWidth attributes when necessary.  Also, the columns attribute on inputText may be helpful.
   *              </p>
   */
  final public UIComponent getFooter()
  {
    return getFacet(FOOTER_FACET);
  }

  /**
   * This facet is rendered under the columns and usually contains a panelButtonBar.
   *              <p>
   * This facet may not always line up perfectly, especially if the labels or fields are longer than expected.  Try adjusting things with the labelWidth and fieldWidth attributes when necessary.  Also, the columns attribute on inputText may be helpful.
   *              </p>
   */
  @SuppressWarnings("unchecked")
  final public void setFooter(UIComponent footerFacet)
  {
    getFacets().put(FOOTER_FACET, footerFacet);
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
   * Gets The preferred width of the field.  Usually a percentage, but may be specified as either a percentage or an absolute number of pixels.  If the width is not specified, it will default appropriately.  If specified as a percentage the labelWidth plus the fieldWidth should add up to 100%, regardless of the number of columns.  If the fieldWidth is specified and is a percentage the labelWidth will be derived appropriately if not specified.
   *
   * @return  the new fieldWidth value
   */
  final public String getFieldWidth()
  {
    return ComponentUtils.resolveString(getProperty(FIELD_WIDTH_KEY));
  }

  /**
   * Sets The preferred width of the field.  Usually a percentage, but may be specified as either a percentage or an absolute number of pixels.  If the width is not specified, it will default appropriately.  If specified as a percentage the labelWidth plus the fieldWidth should add up to 100%, regardless of the number of columns.  If the fieldWidth is specified and is a percentage the labelWidth will be derived appropriately if not specified.
   * 
   * @param fieldWidth  the new fieldWidth value
   */
  final public void setFieldWidth(String fieldWidth)
  {
    setProperty(FIELD_WIDTH_KEY, (fieldWidth));
  }

  /**
   * Gets The preferred width of the label.  Usually a percentage, but may be specified as either a percentage or an absolute number of pixels.  If the width is not specified, it will default appropriately.  If specified as a percentage the labelWidth plus the fieldWidth should add up to 100%, regardless of the number of columns.  If the labelWidth is specified and is a percentage the fieldWidth will be derived appropriately if not specified.
   *
   * @return  the new labelWidth value
   */
  final public String getLabelWidth()
  {
    return ComponentUtils.resolveString(getProperty(LABEL_WIDTH_KEY));
  }

  /**
   * Sets The preferred width of the label.  Usually a percentage, but may be specified as either a percentage or an absolute number of pixels.  If the width is not specified, it will default appropriately.  If specified as a percentage the labelWidth plus the fieldWidth should add up to 100%, regardless of the number of columns.  If the labelWidth is specified and is a percentage the fieldWidth will be derived appropriately if not specified.
   * 
   * @param labelWidth  the new labelWidth value
   */
  final public void setLabelWidth(String labelWidth)
  {
    setProperty(LABEL_WIDTH_KEY, (labelWidth));
  }

  /**
   * Gets Sets the maximum number of columns to show.  This attribute defaults to 3 and 2 on PDAs.  If this panelFormLayout is inside of another panelFormLayout, this will always be 1.
   *
   * @return  the new maxColumns value
   */
  final public int getMaxColumns()
  {
    return ComponentUtils.resolveInteger(getProperty(MAX_COLUMNS_KEY));
  }

  /**
   * Sets Sets the maximum number of columns to show.  This attribute defaults to 3 and 2 on PDAs.  If this panelFormLayout is inside of another panelFormLayout, this will always be 1.
   * 
   * @param maxColumns  the new maxColumns value
   */
  final public void setMaxColumns(int maxColumns)
  {
    setProperty(MAX_COLUMNS_KEY, Integer.valueOf(maxColumns));
  }

  /**
   * Gets Sets the number of rows after which to start a new column.  This attribute defaults to Integer.MAX_VALUE.  The number of rows actually rendered depends also on the "maxColumns" property.  If the children will not fit in the given number of rows and columns, the number of rows will increase to accomodate the children.
   *
   * @return  the new rows value
   */
  final public int getRows()
  {
    return ComponentUtils.resolveInteger(getProperty(ROWS_KEY));
  }

  /**
   * Sets Sets the number of rows after which to start a new column.  This attribute defaults to Integer.MAX_VALUE.  The number of rows actually rendered depends also on the "maxColumns" property.  If the children will not fit in the given number of rows and columns, the number of rows will increase to accomodate the children.
   * 
   * @param rows  the new rows value
   */
  final public void setRows(int rows)
  {
    setProperty(ROWS_KEY, Integer.valueOf(rows));
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
   * Construct an instance of the CorePanelFormLayout.
   */
  protected CorePanelFormLayout(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Panel","org.apache.myfaces.trinidad.FormLayout");
  }
}
