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
package org.apache.myfaces.trinidadinternal.taglib.core.nav;

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandButton;
import org.apache.myfaces.trinidadinternal.taglib.UIXCommandTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreCommandButtonTag extends UIXCommandTag
{

  /**
   * Construct an instance of the CoreCommandButtonTag.
   */
  public CoreCommandButtonTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreCommandButton";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Button";
  }

  private String _text;
  final public void setText(String text)
  {
    _text = text;
  }

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
  }

  private String _textAndAccessKey;
  final public void setTextAndAccessKey(String textAndAccessKey)
  {
    _textAndAccessKey = textAndAccessKey;
  }

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
  }

  private String _partialSubmit;
  final public void setPartialSubmit(String partialSubmit)
  {
    _partialSubmit = partialSubmit;
  }

  private String _blocking;
  final public void setBlocking(String blocking)
  {
    _blocking = blocking;
  }

  private String _icon;
  final public void setIcon(String icon)
  {
    _icon = icon;
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

  private String _useWindow;
  final public void setUseWindow(String useWindow)
  {
    _useWindow = useWindow;
  }

  private String _windowHeight;
  final public void setWindowHeight(String windowHeight)
  {
    _windowHeight = windowHeight;
  }

  private String _windowWidth;
  final public void setWindowWidth(String windowWidth)
  {
    _windowWidth = windowWidth;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setCharacterProperty(bean, CoreCommandButton.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreCommandButton.ONCLICK_KEY, _onclick);
    setStringArrayProperty(bean, CoreCommandButton.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setIntegerProperty(bean, CoreCommandButton.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreCommandButton.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreCommandButton.TEXT_KEY, _text);
    setBooleanProperty(bean, CoreCommandButton.BLOCKING_KEY, _blocking);
    setProperty(bean, CoreCommandButton.ICON_KEY, _icon);
    setProperty(bean, CoreCommandButton.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreCommandButton.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreCommandButton.ONMOUSEDOWN_KEY, _onmousedown);
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreCommandButton.TEXT_KEY,
          CoreCommandButton.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreCommandButton.TEXT_KEY,
          CoreCommandButton.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreCommandButton.ONMOUSEOUT_KEY, _onmouseout);
    setIntegerProperty(bean, CoreCommandButton.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreCommandButton.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreCommandButton.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreCommandButton.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreCommandButton.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreCommandButton.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreCommandButton.STYLE_CLASS_KEY, _styleClass);
    setBooleanProperty(bean, CoreCommandButton.DISABLED_KEY, _disabled);
    setBooleanProperty(bean, CoreCommandButton.USE_WINDOW_KEY, _useWindow);
    setBooleanProperty(bean, CoreCommandButton.PARTIAL_SUBMIT_KEY, _partialSubmit);
    setProperty(bean, CoreCommandButton.ONKEYPRESS_KEY, _onkeypress);
  }

  @Override
  public void release()
  {
    super.release();
    _accessKey = null;
    _onclick = null;
    _partialTriggers = null;
    _windowWidth = null;
    _shortDesc = null;
    _text = null;
    _blocking = null;
    _icon = null;
    _onmousemove = null;
    _inlineStyle = null;
    _onmousedown = null;
    _textAndAccessKey = null;
    _onmouseout = null;
    _windowHeight = null;
    _onmouseup = null;
    _onkeyup = null;
    _onkeydown = null;
    _ondblclick = null;
    _onmouseover = null;
    _styleClass = null;
    _disabled = null;
    _useWindow = null;
    _partialSubmit = null;
    _onkeypress = null;
  }
}
