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
import org.apache.myfaces.trinidad.component.core.nav.CoreGoLink;
import org.apache.myfaces.trinidadinternal.taglib.UIXGoTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreGoLinkTag extends UIXGoTag
{

  /**
   * Construct an instance of the CoreGoLinkTag.
   */
  public CoreGoLinkTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreGoLink";
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

  private String _targetFrame;
  final public void setTargetFrame(String targetFrame)
  {
    _targetFrame = targetFrame;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreGoLink.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreGoLink.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreGoLink.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreGoLink.TARGET_FRAME_KEY, _targetFrame);
    setProperty(bean, CoreGoLink.ONKEYUP_KEY, _onkeyup);
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreGoLink.TEXT_KEY,
          CoreGoLink.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreGoLink.TEXT_KEY,
          CoreGoLink.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreGoLink.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreGoLink.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreGoLink.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreGoLink.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreGoLink.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreGoLink.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CoreGoLink.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreGoLink.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreGoLink.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreGoLink.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreGoLink.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreGoLink.TEXT_KEY, _text);
    setCharacterProperty(bean, CoreGoLink.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreGoLink.ONMOUSEOVER_KEY, _onmouseover);
    setBooleanProperty(bean, CoreGoLink.DISABLED_KEY, _disabled);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _onkeydown = null;
    _styleClass = null;
    _targetFrame = null;
    _onkeyup = null;
    _textAndAccessKey = null;
    _onclick = null;
    _onfocus = null;
    _onmouseup = null;
    _onmousedown = null;
    _onkeypress = null;
    _shortDesc = null;
    _partialTriggers = null;
    _onblur = null;
    _onmouseout = null;
    _ondblclick = null;
    _onmousemove = null;
    _text = null;
    _accessKey = null;
    _onmouseover = null;
    _disabled = null;
  }
}
