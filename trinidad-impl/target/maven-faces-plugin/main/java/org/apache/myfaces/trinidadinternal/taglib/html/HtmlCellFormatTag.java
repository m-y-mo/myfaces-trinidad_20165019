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
package org.apache.myfaces.trinidadinternal.taglib.html;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.html.HtmlCellFormat;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class HtmlCellFormatTag extends UIXComponentTag
{

  /**
   * Construct an instance of the HtmlCellFormatTag.
   */
  public HtmlCellFormatTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlCellFormat";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.CellFormat";
  }

  private String _shortText;
  final public void setShortText(String shortText)
  {
    _shortText = shortText;
  }

  private String _halign;
  final public void setHalign(String halign)
  {
    _halign = halign;
  }

  private String _valign;
  final public void setValign(String valign)
  {
    _valign = valign;
  }

  private String _width;
  final public void setWidth(String width)
  {
    _width = width;
  }

  private String _height;
  final public void setHeight(String height)
  {
    _height = height;
  }

  private String _columnSpan;
  final public void setColumnSpan(String columnSpan)
  {
    _columnSpan = columnSpan;
  }

  private String _rowSpan;
  final public void setRowSpan(String rowSpan)
  {
    _rowSpan = rowSpan;
  }

  private String _wrappingDisabled;
  final public void setWrappingDisabled(String wrappingDisabled)
  {
    _wrappingDisabled = wrappingDisabled;
  }

  private String _headers;
  final public void setHeaders(String headers)
  {
    _headers = headers;
  }

  private String _header;
  final public void setHeader(String header)
  {
    _header = header;
  }

  private String _shortDesc;
  final public void setShortDesc(String shortDesc)
  {
    _shortDesc = shortDesc;
  }

  private String _partialTriggers;
  final public void setPartialTriggers(String partialTriggers)
  {
    _partialTriggers = partialTriggers;
  }

  private String _onclick;
  final public void setOnclick(String onclick)
  {
    _onclick = onclick;
  }

  private String _ondblclick;
  final public void setOndblclick(String ondblclick)
  {
    _ondblclick = ondblclick;
  }

  private String _onmousedown;
  final public void setOnmousedown(String onmousedown)
  {
    _onmousedown = onmousedown;
  }

  private String _onmouseup;
  final public void setOnmouseup(String onmouseup)
  {
    _onmouseup = onmouseup;
  }

  private String _onmouseover;
  final public void setOnmouseover(String onmouseover)
  {
    _onmouseover = onmouseover;
  }

  private String _onmousemove;
  final public void setOnmousemove(String onmousemove)
  {
    _onmousemove = onmousemove;
  }

  private String _onmouseout;
  final public void setOnmouseout(String onmouseout)
  {
    _onmouseout = onmouseout;
  }

  private String _onkeypress;
  final public void setOnkeypress(String onkeypress)
  {
    _onkeypress = onkeypress;
  }

  private String _onkeydown;
  final public void setOnkeydown(String onkeydown)
  {
    _onkeydown = onkeydown;
  }

  private String _onkeyup;
  final public void setOnkeyup(String onkeyup)
  {
    _onkeyup = onkeyup;
  }

  private String _styleClass;
  final public void setStyleClass(String styleClass)
  {
    _styleClass = styleClass;
  }

  private String _inlineStyle;
  final public void setInlineStyle(String inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, HtmlCellFormat.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, HtmlCellFormat.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, HtmlCellFormat.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlCellFormat.SHORT_TEXT_KEY, _shortText);
    setProperty(bean, HtmlCellFormat.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlCellFormat.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, HtmlCellFormat.HEIGHT_KEY, _height);
    setProperty(bean, HtmlCellFormat.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, HtmlCellFormat.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlCellFormat.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlCellFormat.WIDTH_KEY, _width);
    setProperty(bean, HtmlCellFormat.ONCLICK_KEY, _onclick);
    setProperty(bean, HtmlCellFormat.HALIGN_KEY, _halign);
    setProperty(bean, HtmlCellFormat.VALIGN_KEY, _valign);
    setBooleanProperty(bean, HtmlCellFormat.WRAPPING_DISABLED_KEY, _wrappingDisabled);
    setProperty(bean, HtmlCellFormat.ONMOUSEOVER_KEY, _onmouseover);
    setIntegerProperty(bean, HtmlCellFormat.ROW_SPAN_KEY, _rowSpan);
    setBooleanProperty(bean, HtmlCellFormat.HEADER_KEY, _header);
    setProperty(bean, HtmlCellFormat.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, HtmlCellFormat.SHORT_DESC_KEY, _shortDesc);
    setIntegerProperty(bean, HtmlCellFormat.COLUMN_SPAN_KEY, _columnSpan);
    setStringArrayProperty(bean, HtmlCellFormat.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlCellFormat.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, HtmlCellFormat.HEADERS_KEY, _headers);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousedown = null;
    _onmousemove = null;
    _onkeydown = null;
    _shortText = null;
    _ondblclick = null;
    _onmouseup = null;
    _height = null;
    _onmouseout = null;
    _inlineStyle = null;
    _styleClass = null;
    _width = null;
    _onclick = null;
    _halign = null;
    _valign = null;
    _wrappingDisabled = null;
    _onmouseover = null;
    _rowSpan = null;
    _header = null;
    _onkeypress = null;
    _shortDesc = null;
    _columnSpan = null;
    _partialTriggers = null;
    _onkeyup = null;
    _headers = null;
  }
}
