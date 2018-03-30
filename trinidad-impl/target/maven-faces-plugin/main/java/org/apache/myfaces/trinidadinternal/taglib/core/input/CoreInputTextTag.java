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
import org.apache.myfaces.trinidad.component.core.input.CoreInputText;
import org.apache.myfaces.trinidadinternal.taglib.UIXInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputTextTag extends UIXInputTag
{

  /**
   * Construct an instance of the CoreInputTextTag.
   */
  public CoreInputTextTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputText";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Text";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private String _rows;
  final public void setRows(String rows)
  {
    _rows = rows;
  }

  private String _wrap;
  final public void setWrap(String wrap)
  {
    _wrap = wrap;
  }

  private String _secret;
  final public void setSecret(String secret)
  {
    _secret = secret;
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

  private String _onchange;
  final public void setOnchange(String onchange)
  {
    _onchange = onchange;
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

  private String _styleClass;
  final public void setStyleClass(String styleClass)
  {
    _styleClass = styleClass;
  }

  private String _inlineStyle;
  final public void setInlineStyle(String inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  private String _showRequired;
  final public void setShowRequired(String showRequired)
  {
    _showRequired = showRequired;
  }

  private String _columns;
  final public void setColumns(String columns)
  {
    _columns = columns;
  }

  private String _maximumLength;
  final public void setMaximumLength(String maximumLength)
  {
    _maximumLength = maximumLength;
  }

  private String _autoComplete;
  final public void setAutoComplete(String autoComplete)
  {
    _autoComplete = autoComplete;
  }

  private String _onselect;
  final public void setOnselect(String onselect)
  {
    _onselect = onselect;
  }

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
  }

  private String _labelAndAccessKey;
  final public void setLabelAndAccessKey(String labelAndAccessKey)
  {
    _labelAndAccessKey = labelAndAccessKey;
  }

  private String _autoSubmit;
  final public void setAutoSubmit(String autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreInputText.ONCHANGE_KEY, _onchange);
    setBooleanProperty(bean, CoreInputText.AUTO_SUBMIT_KEY, _autoSubmit);
    setCharacterProperty(bean, CoreInputText.ACCESS_KEY_KEY, _accessKey);
    setBooleanProperty(bean, CoreInputText.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputText.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreInputText.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreInputText.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreInputText.WRAP_KEY, _wrap);
    setProperty(bean, CoreInputText.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputText.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreInputText.SHORT_DESC_KEY, _shortDesc);
    setBooleanProperty(bean, CoreInputText.DISABLED_KEY, _disabled);
    setStringArrayProperty(bean, CoreInputText.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreInputText.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreInputText.ONMOUSEDOWN_KEY, _onmousedown);
    setBooleanProperty(bean, CoreInputText.SECRET_KEY, _secret);
    setProperty(bean, CoreInputText.ONKEYPRESS_KEY, _onkeypress);
    setIntegerProperty(bean, CoreInputText.MAXIMUM_LENGTH_KEY, _maximumLength);
    setBooleanProperty(bean, CoreInputText.SHOW_REQUIRED_KEY, _showRequired);
    setBooleanProperty(bean, CoreInputText.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputText.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreInputText.ONCLICK_KEY, _onclick);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreInputText.LABEL_KEY,
          CoreInputText.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputText.LABEL_KEY,
          CoreInputText.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreInputText.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputText.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreInputText.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreInputText.LABEL_KEY, _label);
    setIntegerProperty(bean, CoreInputText.COLUMNS_KEY, _columns);
    setProperty(bean, CoreInputText.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreInputText.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputText.ONSELECT_KEY, _onselect);
    setProperty(bean, CoreInputText.CONTENT_STYLE_KEY, _contentStyle);
    setIntegerProperty(bean, CoreInputText.ROWS_KEY, _rows);
  }

  @Override
  public void release()
  {
    super.release();
    _onchange = null;
    _autoSubmit = null;
    _accessKey = null;
    _readOnly = null;
    _onmouseover = null;
    _onmouseup = null;
    _onblur = null;
    _wrap = null;
    _onmousemove = null;
    _styleClass = null;
    _shortDesc = null;
    _disabled = null;
    _partialTriggers = null;
    _onfocus = null;
    _onmousedown = null;
    _secret = null;
    _onkeypress = null;
    _maximumLength = null;
    _showRequired = null;
    _simple = null;
    _onkeydown = null;
    _onclick = null;
    _labelAndAccessKey = null;
    _onkeyup = null;
    _inlineStyle = null;
    _ondblclick = null;
    _label = null;
    _columns = null;
    _autoComplete = null;
    _onmouseout = null;
    _onselect = null;
    _contentStyle = null;
    _rows = null;
  }
}
