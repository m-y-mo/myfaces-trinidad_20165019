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

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.layout.CoreShowDetailItem;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowDetailTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreShowDetailItemTag extends UIXShowDetailTag
{

  /**
   * Construct an instance of the CoreShowDetailItemTag.
   */
  public CoreShowDetailItemTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreShowDetailItem";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Item";
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

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
  }

  private String _text;
  final public void setText(String text)
  {
    _text = text;
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

  private String _flex;
  final public void setFlex(String flex)
  {
    _flex = flex;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreShowDetailItem.ONMOUSEUP_KEY, _onmouseup);
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreShowDetailItem.TEXT_KEY,
          CoreShowDetailItem.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreShowDetailItem.TEXT_KEY,
          CoreShowDetailItem.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreShowDetailItem.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreShowDetailItem.TEXT_KEY, _text);
    setProperty(bean, CoreShowDetailItem.ONMOUSEOVER_KEY, _onmouseover);
    setStringArrayProperty(bean, CoreShowDetailItem.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreShowDetailItem.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreShowDetailItem.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreShowDetailItem.ONKEYDOWN_KEY, _onkeydown);
    setCharacterProperty(bean, CoreShowDetailItem.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreShowDetailItem.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreShowDetailItem.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreShowDetailItem.ONDBLCLICK_KEY, _ondblclick);
    setIntegerProperty(bean, CoreShowDetailItem.FLEX_KEY, _flex);
    setProperty(bean, CoreShowDetailItem.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreShowDetailItem.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreShowDetailItem.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreShowDetailItem.ONKEYUP_KEY, _onkeyup);
    setBooleanProperty(bean, CoreShowDetailItem.DISABLED_KEY, _disabled);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseup = null;
    _textAndAccessKey = null;
    _inlineStyle = null;
    _text = null;
    _onmouseover = null;
    _partialTriggers = null;
    _onmouseout = null;
    _onclick = null;
    _onkeydown = null;
    _accessKey = null;
    _onmousedown = null;
    _onmousemove = null;
    _ondblclick = null;
    _flex = null;
    _styleClass = null;
    _onkeypress = null;
    _shortDesc = null;
    _onkeyup = null;
    _disabled = null;
  }
}
