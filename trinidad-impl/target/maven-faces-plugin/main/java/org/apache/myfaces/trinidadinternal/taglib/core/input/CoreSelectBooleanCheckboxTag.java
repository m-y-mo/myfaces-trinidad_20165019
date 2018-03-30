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
import org.apache.myfaces.trinidad.component.core.input.CoreSelectBooleanCheckbox;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectBooleanTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectBooleanCheckboxTag extends UIXSelectBooleanTag
{

  /**
   * Construct an instance of the CoreSelectBooleanCheckboxTag.
   */
  public CoreSelectBooleanCheckboxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectBooleanCheckbox";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Checkbox";
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
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEMOVE_KEY, _onmousemove);
    setBooleanProperty(bean, CoreSelectBooleanCheckbox.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectBooleanCheckbox.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectBooleanCheckbox.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEOVER_KEY, _onmouseover);
    setStringArrayProperty(bean, CoreSelectBooleanCheckbox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectBooleanCheckbox.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectBooleanCheckbox.TEXT_KEY, _text);
    setProperty(bean, CoreSelectBooleanCheckbox.LABEL_KEY, _label);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectBooleanCheckbox.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEUP_KEY, _onmouseup);
    setBooleanProperty(bean, CoreSelectBooleanCheckbox.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreSelectBooleanCheckbox.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectBooleanCheckbox.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectBooleanCheckbox.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectBooleanCheckbox.ONDBLCLICK_KEY, _ondblclick);
    setBooleanProperty(bean, CoreSelectBooleanCheckbox.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreSelectBooleanCheckbox.ONKEYPRESS_KEY, _onkeypress);
    if (_textAndAccessKey != null)
    {
      if (isValueReference(_textAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_textAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreSelectBooleanCheckbox.TEXT_KEY,
          CoreSelectBooleanCheckbox.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreSelectBooleanCheckbox.TEXT_KEY,
          CoreSelectBooleanCheckbox.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectBooleanCheckbox.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEOUT_KEY, _onmouseout);
    setBooleanProperty(bean, CoreSelectBooleanCheckbox.SHOW_REQUIRED_KEY, _showRequired);
    setBooleanProperty(bean, CoreSelectBooleanCheckbox.DISABLED_KEY, _disabled);
    setCharacterProperty(bean, CoreSelectBooleanCheckbox.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreSelectBooleanCheckbox.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectBooleanCheckbox.SHORT_DESC_KEY, _shortDesc);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousemove = null;
    _simple = null;
    _onkeyup = null;
    _contentStyle = null;
    _onmouseover = null;
    _partialTriggers = null;
    _styleClass = null;
    _text = null;
    _label = null;
    _onmousedown = null;
    _onfocus = null;
    _onmouseup = null;
    _autoSubmit = null;
    _onkeydown = null;
    _onchange = null;
    _inlineStyle = null;
    _ondblclick = null;
    _readOnly = null;
    _onkeypress = null;
    _textAndAccessKey = null;
    _onclick = null;
    _onmouseout = null;
    _showRequired = null;
    _disabled = null;
    _accessKey = null;
    _onblur = null;
    _shortDesc = null;
  }
}
