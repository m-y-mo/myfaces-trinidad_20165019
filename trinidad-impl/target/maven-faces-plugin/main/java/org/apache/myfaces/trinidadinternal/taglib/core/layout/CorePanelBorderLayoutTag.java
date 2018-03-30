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
package org.apache.myfaces.trinidadinternal.taglib.core.layout;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.layout.CorePanelBorderLayout;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelBorderLayoutTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelBorderLayoutTag.
   */
  public CorePanelBorderLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelBorderLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.BorderLayout";
  }

  private String _layout;
  final public void setLayout(String layout)
  {
    _layout = layout;
  }

  private String _topHeight;
  final public void setTopHeight(String topHeight)
  {
    _topHeight = topHeight;
  }

  private String _bottomHeight;
  final public void setBottomHeight(String bottomHeight)
  {
    _bottomHeight = bottomHeight;
  }

  private String _innerTopHeight;
  final public void setInnerTopHeight(String innerTopHeight)
  {
    _innerTopHeight = innerTopHeight;
  }

  private String _innerBottomHeight;
  final public void setInnerBottomHeight(String innerBottomHeight)
  {
    _innerBottomHeight = innerBottomHeight;
  }

  private String _startWidth;
  final public void setStartWidth(String startWidth)
  {
    _startWidth = startWidth;
  }

  private String _endWidth;
  final public void setEndWidth(String endWidth)
  {
    _endWidth = endWidth;
  }

  private String _leftWidth;
  final public void setLeftWidth(String leftWidth)
  {
    _leftWidth = leftWidth;
  }

  private String _rightWidth;
  final public void setRightWidth(String rightWidth)
  {
    _rightWidth = rightWidth;
  }

  private String _innerStartWidth;
  final public void setInnerStartWidth(String innerStartWidth)
  {
    _innerStartWidth = innerStartWidth;
  }

  private String _innerEndWidth;
  final public void setInnerEndWidth(String innerEndWidth)
  {
    _innerEndWidth = innerEndWidth;
  }

  private String _innerLeftWidth;
  final public void setInnerLeftWidth(String innerLeftWidth)
  {
    _innerLeftWidth = innerLeftWidth;
  }

  private String _innerRightWidth;
  final public void setInnerRightWidth(String innerRightWidth)
  {
    _innerRightWidth = innerRightWidth;
  }

  private String _inlineStyle;
  final public void setInlineStyle(String inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  private String _styleClass;
  final public void setStyleClass(String styleClass)
  {
    _styleClass = styleClass;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelBorderLayout.BOTTOM_HEIGHT_KEY, _bottomHeight);
    setProperty(bean, CorePanelBorderLayout.INNER_END_WIDTH_KEY, _innerEndWidth);
    setProperty(bean, CorePanelBorderLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelBorderLayout.INNER_TOP_HEIGHT_KEY, _innerTopHeight);
    setProperty(bean, CorePanelBorderLayout.INNER_RIGHT_WIDTH_KEY, _innerRightWidth);
    setProperty(bean, CorePanelBorderLayout.INNER_LEFT_WIDTH_KEY, _innerLeftWidth);
    setProperty(bean, CorePanelBorderLayout.INNER_START_WIDTH_KEY, _innerStartWidth);
    setProperty(bean, CorePanelBorderLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelBorderLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelBorderLayout.TOP_HEIGHT_KEY, _topHeight);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelBorderLayout.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelBorderLayout.LAYOUT_KEY, _layout);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CorePanelBorderLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelBorderLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelBorderLayout.INNER_BOTTOM_HEIGHT_KEY, _innerBottomHeight);
    setProperty(bean, CorePanelBorderLayout.RIGHT_WIDTH_KEY, _rightWidth);
    setProperty(bean, CorePanelBorderLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelBorderLayout.START_WIDTH_KEY, _startWidth);
    setProperty(bean, CorePanelBorderLayout.LEFT_WIDTH_KEY, _leftWidth);
    setProperty(bean, CorePanelBorderLayout.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelBorderLayout.END_WIDTH_KEY, _endWidth);
    setProperty(bean, CorePanelBorderLayout.INLINE_STYLE_KEY, _inlineStyle);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseout = null;
    _onmousemove = null;
    _bottomHeight = null;
    _innerEndWidth = null;
    _onkeydown = null;
    _onmouseover = null;
    _innerTopHeight = null;
    _innerRightWidth = null;
    _innerLeftWidth = null;
    _innerStartWidth = null;
    _shortDesc = null;
    _styleClass = null;
    _topHeight = null;
    _onmousedown = null;
    _onkeypress = null;
    _layout = null;
    _onmouseup = null;
    _partialTriggers = null;
    _onclick = null;
    _innerBottomHeight = null;
    _rightWidth = null;
    _ondblclick = null;
    _startWidth = null;
    _leftWidth = null;
    _onkeyup = null;
    _endWidth = null;
    _inlineStyle = null;
  }
}
