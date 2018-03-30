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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelBox;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelBoxTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelBoxTag.
   */
  public CorePanelBoxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelBox";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Box";
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

  private String _text;
  final public void setText(String text)
  {
    _text = text;
  }

  private String _background;
  final public void setBackground(String background)
  {
    _background = background;
  }

  private String _icon;
  final public void setIcon(String icon)
  {
    _icon = icon;
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelBox.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelBox.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelBox.TEXT_KEY, _text);
    setProperty(bean, CorePanelBox.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelBox.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelBox.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelBox.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelBox.ICON_KEY, _icon);
    setProperty(bean, CorePanelBox.BACKGROUND_KEY, _background);
    setProperty(bean, CorePanelBox.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CorePanelBox.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelBox.ONKEYUP_KEY, _onkeyup);
    setStringArrayProperty(bean, CorePanelBox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelBox.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelBox.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelBox.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelBox.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelBox.ONMOUSEOUT_KEY, _onmouseout);
  }

  @Override
  public void release()
  {
    super.release();
    _shortDesc = null;
    _onmouseup = null;
    _text = null;
    _onmousemove = null;
    _onkeydown = null;
    _onkeypress = null;
    _styleClass = null;
    _icon = null;
    _background = null;
    _contentStyle = null;
    _ondblclick = null;
    _onkeyup = null;
    _partialTriggers = null;
    _onmousedown = null;
    _inlineStyle = null;
    _onmouseover = null;
    _onclick = null;
    _onmouseout = null;
  }
}
