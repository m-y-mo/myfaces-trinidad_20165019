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
import org.apache.myfaces.trinidad.component.html.HtmlTableLayout;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class HtmlTableLayoutTag extends UIXComponentTag
{

  /**
   * Construct an instance of the HtmlTableLayoutTag.
   */
  public HtmlTableLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlTableLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.TableLayout";
  }

  private String _width;
  final public void setWidth(String width)
  {
    _width = width;
  }

  private String _halign;
  final public void setHalign(String halign)
  {
    _halign = halign;
  }

  private String _cellSpacing;
  final public void setCellSpacing(String cellSpacing)
  {
    _cellSpacing = cellSpacing;
  }

  private String _cellPadding;
  final public void setCellPadding(String cellPadding)
  {
    _cellPadding = cellPadding;
  }

  private String _borderWidth;
  final public void setBorderWidth(String borderWidth)
  {
    _borderWidth = borderWidth;
  }

  private String _summary;
  final public void setSummary(String summary)
  {
    _summary = summary;
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
    setStringArrayProperty(bean, HtmlTableLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setIntegerProperty(bean, HtmlTableLayout.BORDER_WIDTH_KEY, _borderWidth);
    setProperty(bean, HtmlTableLayout.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, HtmlTableLayout.WIDTH_KEY, _width);
    setProperty(bean, HtmlTableLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlTableLayout.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, HtmlTableLayout.ONKEYUP_KEY, _onkeyup);
    setIntegerProperty(bean, HtmlTableLayout.CELL_SPACING_KEY, _cellSpacing);
    setProperty(bean, HtmlTableLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, HtmlTableLayout.ONKEYPRESS_KEY, _onkeypress);
    setIntegerProperty(bean, HtmlTableLayout.CELL_PADDING_KEY, _cellPadding);
    setProperty(bean, HtmlTableLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlTableLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, HtmlTableLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, HtmlTableLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlTableLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlTableLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlTableLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, HtmlTableLayout.HALIGN_KEY, _halign);
    setProperty(bean, HtmlTableLayout.SUMMARY_KEY, _summary);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _borderWidth = null;
    _onmouseup = null;
    _width = null;
    _shortDesc = null;
    _onmouseout = null;
    _onkeyup = null;
    _cellSpacing = null;
    _onmouseover = null;
    _onkeypress = null;
    _cellPadding = null;
    _styleClass = null;
    _onclick = null;
    _onmousedown = null;
    _inlineStyle = null;
    _ondblclick = null;
    _onkeydown = null;
    _onmousemove = null;
    _halign = null;
    _summary = null;
  }
}
