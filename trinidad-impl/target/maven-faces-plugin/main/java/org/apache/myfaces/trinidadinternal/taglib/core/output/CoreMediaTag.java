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
package org.apache.myfaces.trinidadinternal.taglib.core.output;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.output.CoreMedia;
import org.apache.myfaces.trinidadinternal.taglib.UIXObjectTag;

/**
 * Auto-generated tag class.
 */
public class CoreMediaTag extends UIXObjectTag
{

  /**
   * Construct an instance of the CoreMediaTag.
   */
  public CoreMediaTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreMedia";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Media";
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

  private String _innerWidth;
  final public void setInnerWidth(String innerWidth)
  {
    _innerWidth = innerWidth;
  }

  private String _innerHeight;
  final public void setInnerHeight(String innerHeight)
  {
    _innerHeight = innerHeight;
  }

  private String _source;
  final public void setSource(String source)
  {
    _source = source;
  }

  private String _autostart;
  final public void setAutostart(String autostart)
  {
    _autostart = autostart;
  }

  private String _playCount;
  final public void setPlayCount(String playCount)
  {
    _playCount = playCount;
  }

  private String _contentType;
  final public void setContentType(String contentType)
  {
    _contentType = contentType;
  }

  private String _standbyText;
  final public void setStandbyText(String standbyText)
  {
    _standbyText = standbyText;
  }

  private String _player;
  final public void setPlayer(String player)
  {
    _player = player;
  }

  private String _controls;
  final public void setControls(String controls)
  {
    _controls = controls;
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
    setProperty(bean, CoreMedia.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreMedia.HEIGHT_KEY, _height);
    setProperty(bean, CoreMedia.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreMedia.SOURCE_KEY, _source);
    setProperty(bean, CoreMedia.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreMedia.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreMedia.SHORT_DESC_KEY, _shortDesc);
    setBooleanProperty(bean, CoreMedia.AUTOSTART_KEY, _autostart);
    setProperty(bean, CoreMedia.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreMedia.ONMOUSEMOVE_KEY, _onmousemove);
    setIntegerProperty(bean, CoreMedia.PLAY_COUNT_KEY, _playCount);
    setStringArrayProperty(bean, CoreMedia.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreMedia.CONTENT_TYPE_KEY, _contentType);
    setProperty(bean, CoreMedia.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreMedia.PLAYER_KEY, _player);
    setProperty(bean, CoreMedia.CONTROLS_KEY, _controls);
    setProperty(bean, CoreMedia.WIDTH_KEY, _width);
    setIntegerProperty(bean, CoreMedia.INNER_HEIGHT_KEY, _innerHeight);
    setProperty(bean, CoreMedia.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreMedia.STANDBY_TEXT_KEY, _standbyText);
    setIntegerProperty(bean, CoreMedia.INNER_WIDTH_KEY, _innerWidth);
    setProperty(bean, CoreMedia.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreMedia.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreMedia.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreMedia.ONKEYPRESS_KEY, _onkeypress);
  }

  @Override
  public void release()
  {
    super.release();
    _ondblclick = null;
    _height = null;
    _onkeydown = null;
    _source = null;
    _onmouseout = null;
    _onmouseup = null;
    _shortDesc = null;
    _autostart = null;
    _onkeyup = null;
    _onmousemove = null;
    _playCount = null;
    _partialTriggers = null;
    _contentType = null;
    _inlineStyle = null;
    _player = null;
    _controls = null;
    _width = null;
    _innerHeight = null;
    _styleClass = null;
    _standbyText = null;
    _innerWidth = null;
    _onmouseover = null;
    _onmousedown = null;
    _onclick = null;
    _onkeypress = null;
  }
}
