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
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandLink;
import org.apache.myfaces.trinidadinternal.taglib.UIXCommandTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreCommandLinkTag extends UIXCommandTag
{

  /**
   * Construct an instance of the CoreCommandLinkTag.
   */
  public CoreCommandLinkTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreCommandLink";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Link";
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

  private String _onblur;
  final public void setOnblur(String onblur)
  {
    _onblur = onblur;
  }

  private String _onfocus;
  final public void setOnfocus(String onfocus)
  {
    _onfocus = onfocus;
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
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreCommandLink.TEXT_KEY,
          CoreCommandLink.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreCommandLink.TEXT_KEY,
          CoreCommandLink.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreCommandLink.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreCommandLink.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreCommandLink.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreCommandLink.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreCommandLink.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreCommandLink.SHORT_DESC_KEY, _shortDesc);
    setBooleanProperty(bean, CoreCommandLink.DISABLED_KEY, _disabled);
    setProperty(bean, CoreCommandLink.ONMOUSEUP_KEY, _onmouseup);
    setBooleanProperty(bean, CoreCommandLink.BLOCKING_KEY, _blocking);
    setProperty(bean, CoreCommandLink.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreCommandLink.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreCommandLink.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreCommandLink.ONDBLCLICK_KEY, _ondblclick);
    setIntegerProperty(bean, CoreCommandLink.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreCommandLink.ONKEYDOWN_KEY, _onkeydown);
    setStringArrayProperty(bean, CoreCommandLink.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setIntegerProperty(bean, CoreCommandLink.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreCommandLink.ONMOUSEDOWN_KEY, _onmousedown);
    setBooleanProperty(bean, CoreCommandLink.USE_WINDOW_KEY, _useWindow);
    setProperty(bean, CoreCommandLink.TEXT_KEY, _text);
    setBooleanProperty(bean, CoreCommandLink.PARTIAL_SUBMIT_KEY, _partialSubmit);
    setProperty(bean, CoreCommandLink.STYLE_CLASS_KEY, _styleClass);
    setCharacterProperty(bean, CoreCommandLink.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreCommandLink.ONMOUSEOUT_KEY, _onmouseout);
  }

  @Override
  public void release()
  {
    super.release();
    _textAndAccessKey = null;
    _onmouseover = null;
    _onmousemove = null;
    _onclick = null;
    _onfocus = null;
    _inlineStyle = null;
    _shortDesc = null;
    _disabled = null;
    _onmouseup = null;
    _blocking = null;
    _onkeypress = null;
    _onkeyup = null;
    _onblur = null;
    _ondblclick = null;
    _windowHeight = null;
    _onkeydown = null;
    _partialTriggers = null;
    _windowWidth = null;
    _onmousedown = null;
    _useWindow = null;
    _text = null;
    _partialSubmit = null;
    _styleClass = null;
    _accessKey = null;
    _onmouseout = null;
  }
}
