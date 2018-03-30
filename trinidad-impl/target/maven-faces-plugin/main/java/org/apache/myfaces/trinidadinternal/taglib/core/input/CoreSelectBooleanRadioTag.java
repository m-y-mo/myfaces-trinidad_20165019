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
package org.apache.myfaces.trinidadinternal.taglib.core.input;

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreSelectBooleanRadio;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectBooleanTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectBooleanRadioTag extends UIXSelectBooleanTag
{

  /**
   * Construct an instance of the CoreSelectBooleanRadioTag.
   */
  public CoreSelectBooleanRadioTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectBooleanRadio";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Radio";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private String _autoSubmit;
  final public void setAutoSubmit(String autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  private String _readOnly;
  final public void setReadOnly(String readOnly)
  {
    _readOnly = readOnly;
  }

  private String _disabled;
  final public void setDisabled(String disabled)
  {
    _disabled = disabled;
  }

  private String _label;
  final public void setLabel(String label)
  {
    _label = label;
  }

  private String _simple;
  final public void setSimple(String simple)
  {
    _simple = simple;
  }

  private String _text;
  final public void setText(String text)
  {
    _text = text;
  }

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
  }

  private String _textAndAccessKey;
  final public void setTextAndAccessKey(String textAndAccessKey)
  {
    _textAndAccessKey = textAndAccessKey;
  }

  private String _group;
  final public void setGroup(String group)
  {
    _group = group;
  }

  private String _onchange;
  final public void setOnchange(String onchange)
  {
    _onchange = onchange;
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

  private String _showRequired;
  final public void setShowRequired(String showRequired)
  {
    _showRequired = showRequired;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreSelectBooleanRadio.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectBooleanRadio.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectBooleanRadio.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectBooleanRadio.ONKEYUP_KEY, _onkeyup);
    setBooleanProperty(bean, CoreSelectBooleanRadio.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreSelectBooleanRadio.ONDBLCLICK_KEY, _ondblclick);
    setBooleanProperty(bean, CoreSelectBooleanRadio.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreSelectBooleanRadio.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreSelectBooleanRadio.TEXT_KEY, _text);
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreSelectBooleanRadio.TEXT_KEY,
          CoreSelectBooleanRadio.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreSelectBooleanRadio.TEXT_KEY,
          CoreSelectBooleanRadio.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEOVER_KEY, _onmouseover);
    setBooleanProperty(bean, CoreSelectBooleanRadio.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectBooleanRadio.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectBooleanRadio.INLINE_STYLE_KEY, _inlineStyle);
    setCharacterProperty(bean, CoreSelectBooleanRadio.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEMOVE_KEY, _onmousemove);
    setBooleanProperty(bean, CoreSelectBooleanRadio.DISABLED_KEY, _disabled);
    setProperty(bean, CoreSelectBooleanRadio.GROUP_KEY, _group);
    setProperty(bean, CoreSelectBooleanRadio.LABEL_KEY, _label);
    setProperty(bean, CoreSelectBooleanRadio.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectBooleanRadio.ONCLICK_KEY, _onclick);
    setStringArrayProperty(bean, CoreSelectBooleanRadio.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectBooleanRadio.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectBooleanRadio.ONCHANGE_KEY, _onchange);
    setBooleanProperty(bean, CoreSelectBooleanRadio.READ_ONLY_KEY, _readOnly);
  }

  @Override
  public void release()
  {
    super.release();
    _shortDesc = null;
    _onmouseup = null;
    _onkeydown = null;
    _styleClass = null;
    _onmouseout = null;
    _onkeyup = null;
    _autoSubmit = null;
    _ondblclick = null;
    _showRequired = null;
    _onfocus = null;
    _text = null;
    _textAndAccessKey = null;
    _onmouseover = null;
    _simple = null;
    _onkeypress = null;
    _inlineStyle = null;
    _accessKey = null;
    _onmousemove = null;
    _disabled = null;
    _group = null;
    _label = null;
    _contentStyle = null;
    _onclick = null;
    _partialTriggers = null;
    _onmousedown = null;
    _onblur = null;
    _onchange = null;
    _readOnly = null;
  }
}
