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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelPopup;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelPopupTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelPopupTag.
   */
  public CorePanelPopupTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelPopup";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Popup";
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

  private String _triggerType;
  final public void setTriggerType(String triggerType)
  {
    _triggerType = triggerType;
  }

  private String _icon;
  final public void setIcon(String icon)
  {
    _icon = icon;
  }

  private String _text;
  final public void setText(String text)
  {
    _text = text;
  }

  private String _title;
  final public void setTitle(String title)
  {
    _title = title;
  }

  private String _modal;
  final public void setModal(String modal)
  {
    _modal = modal;
  }

  private String _position;
  final public void setPosition(String position)
  {
    _position = position;
  }

  private String _xoffset;
  final public void setXoffset(String xoffset)
  {
    _xoffset = xoffset;
  }

  private String _yoffset;
  final public void setYoffset(String yoffset)
  {
    _yoffset = yoffset;
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelPopup.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelPopup.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelPopup.TRIGGER_TYPE_KEY, _triggerType);
    setIntegerProperty(bean, CorePanelPopup.YOFFSET_KEY, _yoffset);
    setProperty(bean, CorePanelPopup.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelPopup.TEXT_KEY, _text);
    setIntegerProperty(bean, CorePanelPopup.XOFFSET_KEY, _xoffset);
    setProperty(bean, CorePanelPopup.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelPopup.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelPopup.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelPopup.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelPopup.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CorePanelPopup.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelPopup.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelPopup.TITLE_KEY, _title);
    setProperty(bean, CorePanelPopup.POSITION_KEY, _position);
    setProperty(bean, CorePanelPopup.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelPopup.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelPopup.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CorePanelPopup.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelPopup.ICON_KEY, _icon);
    setBooleanProperty(bean, CorePanelPopup.MODAL_KEY, _modal);
    setIntegerProperty(bean, CorePanelPopup.WIDTH_KEY, _width);
    setProperty(bean, CorePanelPopup.ONMOUSEOUT_KEY, _onmouseout);
    setIntegerProperty(bean, CorePanelPopup.HEIGHT_KEY, _height);
  }

  @Override
  public void release()
  {
    super.release();
    _styleClass = null;
    _onmouseover = null;
    _triggerType = null;
    _yoffset = null;
    _inlineStyle = null;
    _text = null;
    _xoffset = null;
    _onmousedown = null;
    _ondblclick = null;
    _onkeydown = null;
    _onmousemove = null;
    _contentStyle = null;
    _onkeyup = null;
    _onclick = null;
    _title = null;
    _position = null;
    _onmouseup = null;
    _onkeypress = null;
    _shortDesc = null;
    _partialTriggers = null;
    _icon = null;
    _modal = null;
    _width = null;
    _onmouseout = null;
    _height = null;
  }
}
