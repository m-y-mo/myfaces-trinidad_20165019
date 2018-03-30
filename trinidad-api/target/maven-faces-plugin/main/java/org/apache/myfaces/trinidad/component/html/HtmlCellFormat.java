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
package org.apache.myfaces.trinidad.component.html;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXComponentBase;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * CellFormat components are used to format cells in a
 *           rowLayout.  It is a container of other layout elements which
 *           allows its contents to take additional formatting, such as vertical
 *           alignment, width, or colspan.
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
public class HtmlCellFormat extends UIXComponentBase
{
  static public final String HALIGN_RIGHT = "right";
  static public final String HALIGN_START = "start";
  static public final String HALIGN_LEFT = "left";
  static public final String HALIGN_END = "end";
  static public final String HALIGN_CENTER = "center";
  static public final String VALIGN_MIDDLE = "middle";
  static public final String VALIGN_TOP = "top";
  static public final String VALIGN_BOTTOM = "bottom";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey SHORT_TEXT_KEY =
    TYPE.registerKey("shortText", String.class);
  static public final PropertyKey HALIGN_KEY =
    TYPE.registerKey("halign", String.class);
  static public final PropertyKey VALIGN_KEY =
    TYPE.registerKey("valign", String.class);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey HEIGHT_KEY =
    TYPE.registerKey("height", String.class);
  static public final PropertyKey COLUMN_SPAN_KEY =
    TYPE.registerKey("columnSpan", Integer.class);
  static public final PropertyKey ROW_SPAN_KEY =
    TYPE.registerKey("rowSpan", Integer.class);
  static public final PropertyKey WRAPPING_DISABLED_KEY =
    TYPE.registerKey("wrappingDisabled", Boolean.class, Boolean.FALSE);
  static public final PropertyKey HEADERS_KEY =
    TYPE.registerKey("headers", String.class);
  static public final PropertyKey HEADER_KEY =
    TYPE.registerKey("header", Boolean.class);
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
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.CellFormat";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.HtmlCellFormat";

  /**
   * Construct an instance of the HtmlCellFormat.
   */
  public HtmlCellFormat()
  {
    super("org.apache.myfaces.trinidad.CellFormat");
  }

  /**
   * Gets This attribute should be used to provide an abbreviated form of
   *              the cell's content, and may be rendered by user agents when
   *              appropriate in place of the cell's content. Abbreviated names
   *              should be short since user agents may render them repeatedly
   *              (especially if this cell is a header cell).
   *
   * @return  the new shortText value
   */
  final public String getShortText()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_TEXT_KEY));
  }

  /**
   * Sets This attribute should be used to provide an abbreviated form of
   *              the cell's content, and may be rendered by user agents when
   *              appropriate in place of the cell's content. Abbreviated names
   *              should be short since user agents may render them repeatedly
   *              (especially if this cell is a header cell).
   * 
   * @param shortText  the new shortText value
   */
  final public void setShortText(String shortText)
  {
    setProperty(SHORT_TEXT_KEY, (shortText));
  }

  /**
   * Gets the horizontal alignment of the grid row elements.
   *               The acceptable values are "center", "left", "right", "start", and "end".
   *
   * @return  the new halign value
   */
  final public String getHalign()
  {
    return ComponentUtils.resolveString(getProperty(HALIGN_KEY));
  }

  /**
   * Sets the horizontal alignment of the grid row elements.
   *               The acceptable values are "center", "left", "right", "start", and "end".
   * 
   * @param halign  the new halign value
   */
  final public void setHalign(String halign)
  {
    setProperty(HALIGN_KEY, (halign));
  }

  /**
   * Gets the vertical alignment of the grid row elements.
   *               The acceptable values are "middle", "top", and "bottom".
   *
   * @return  the new valign value
   */
  final public String getValign()
  {
    return ComponentUtils.resolveString(getProperty(VALIGN_KEY));
  }

  /**
   * Sets the vertical alignment of the grid row elements.
   *               The acceptable values are "middle", "top", and "bottom".
   * 
   * @param valign  the new valign value
   */
  final public void setValign(String valign)
  {
    setProperty(VALIGN_KEY, (valign));
  }

  /**
   * Gets the preferred width of the enclosed layout elements.
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets the preferred width of the enclosed layout elements.
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Gets the preferred height of the enclosed layout elements.
   *
   * @return  the new height value
   */
  final public String getHeight()
  {
    return ComponentUtils.resolveString(getProperty(HEIGHT_KEY));
  }

  /**
   * Sets the preferred height of the enclosed layout elements.
   * 
   * @param height  the new height value
   */
  final public void setHeight(String height)
  {
    setProperty(HEIGHT_KEY, (height));
  }

  /**
   * Gets the number of cells wide the child layout element will be.
   *
   * @return  the new columnSpan value
   */
  final public int getColumnSpan()
  {
    return ComponentUtils.resolveInteger(getProperty(COLUMN_SPAN_KEY));
  }

  /**
   * Sets the number of cells wide the child layout element will be.
   * 
   * @param columnSpan  the new columnSpan value
   */
  final public void setColumnSpan(int columnSpan)
  {
    setProperty(COLUMN_SPAN_KEY, Integer.valueOf(columnSpan));
  }

  /**
   * Gets the number of cells high the child layout element will be.
   *
   * @return  the new rowSpan value
   */
  final public int getRowSpan()
  {
    return ComponentUtils.resolveInteger(getProperty(ROW_SPAN_KEY));
  }

  /**
   * Sets the number of cells high the child layout element will be.
   * 
   * @param rowSpan  the new rowSpan value
   */
  final public void setRowSpan(int rowSpan)
  {
    setProperty(ROW_SPAN_KEY, Integer.valueOf(rowSpan));
  }

  /**
   * Gets whether automatic text wrapping should be disabled for
   *               this cell.
   *
   * @return  the new wrappingDisabled value
   */
  final public boolean isWrappingDisabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(WRAPPING_DISABLED_KEY), false);
  }

  /**
   * Sets whether automatic text wrapping should be disabled for
   *               this cell.
   * 
   * @param wrappingDisabled  the new wrappingDisabled value
   */
  final public void setWrappingDisabled(boolean wrappingDisabled)
  {
    setProperty(WRAPPING_DISABLED_KEY, wrappingDisabled ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets Indicates which table cells are the headers for this cell. This
   *              attribute is used by screen readers to associate header
   *              information with data cells. This must be set to a
   *              space-separated list of IDs. Each ID must be the ID of a
   *              pertinent header cell.
   *
   * @return  the new headers value
   */
  final public String getHeaders()
  {
    return ComponentUtils.resolveString(getProperty(HEADERS_KEY));
  }

  /**
   * Sets Indicates which table cells are the headers for this cell. This
   *              attribute is used by screen readers to associate header
   *              information with data cells. This must be set to a
   *              space-separated list of IDs. Each ID must be the ID of a
   *              pertinent header cell.
   * 
   * @param headers  the new headers value
   */
  final public void setHeaders(String headers)
  {
    setProperty(HEADERS_KEY, (headers));
  }

  /**
   * Gets Indicates whether or not this table cell is a header cell or a data cell.
   *         Setting this attribute to 'true' will mark this cell as a header cell.
   *
   * @return  the new header value
   */
  final public boolean isHeader()
  {
    return ComponentUtils.resolveBoolean(getProperty(HEADER_KEY));
  }

  /**
   * Sets Indicates whether or not this table cell is a header cell or a data cell.
   *         Setting this attribute to 'true' will mark this cell as a header cell.
   * 
   * @param header  the new header value
   */
  final public void setHeader(boolean header)
  {
    setProperty(HEADER_KEY, header ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the short description of the bean.  This text
   *          is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets the short description of the bean.  This text
   *          is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *          This component will listen on the trigger components. If one of the
   *          trigger components receives an event that will cause it to update
   *          in some way, this component will request to be updated too.
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *          This component will listen on the trigger components. If one of the
   *          trigger components receives an event that will cause it to update
   *          in some way, this component will request to be updated too.
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
   * Gets the CSS style class of the bean.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets the CSS style class of the bean.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets the inline CSS style for this element
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the inline CSS style for this element
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
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
   * Construct an instance of the HtmlCellFormat.
   */
  protected HtmlCellFormat(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.CellFormat","org.apache.myfaces.trinidad.CellFormat");
  }
}
