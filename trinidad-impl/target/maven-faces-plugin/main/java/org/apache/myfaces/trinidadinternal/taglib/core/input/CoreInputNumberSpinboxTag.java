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
import org.apache.myfaces.trinidad.component.core.input.CoreInputNumberSpinbox;
import org.apache.myfaces.trinidadinternal.taglib.UIXInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputNumberSpinboxTag extends UIXInputTag
{

  /**
   * Construct an instance of the CoreInputNumberSpinboxTag.
   */
  public CoreInputNumberSpinboxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputNumberSpinbox";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.NumberSpinbox";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
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

  private String _autoComplete;
  final public void setAutoComplete(String autoComplete)
  {
    _autoComplete = autoComplete;
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

  private String _maximum;
  final public void setMaximum(String maximum)
  {
    _maximum = maximum;
  }

  private String _minimum;
  final public void setMinimum(String minimum)
  {
    _minimum = minimum;
  }

  private String _stepSize;
  final public void setStepSize(String stepSize)
  {
    _stepSize = stepSize;
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
    setIntegerProperty(bean, CoreInputNumberSpinbox.COLUMNS_KEY, _columns);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreInputNumberSpinbox.STYLE_CLASS_KEY, _styleClass);
    setBooleanProperty(bean, CoreInputNumberSpinbox.SHOW_REQUIRED_KEY, _showRequired);
    setIntegerProperty(bean, CoreInputNumberSpinbox.MINIMUM_KEY, _minimum);
    setProperty(bean, CoreInputNumberSpinbox.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputNumberSpinbox.ONDBLCLICK_KEY, _ondblclick);
    setStringArrayProperty(bean, CoreInputNumberSpinbox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setIntegerProperty(bean, CoreInputNumberSpinbox.MAXIMUM_KEY, _maximum);
    setProperty(bean, CoreInputNumberSpinbox.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreInputNumberSpinbox.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputNumberSpinbox.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreInputNumberSpinbox.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreInputNumberSpinbox.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputNumberSpinbox.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreInputNumberSpinbox.SHORT_DESC_KEY, _shortDesc);
    setBooleanProperty(bean, CoreInputNumberSpinbox.DISABLED_KEY, _disabled);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreInputNumberSpinbox.LABEL_KEY,
          CoreInputNumberSpinbox.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputNumberSpinbox.LABEL_KEY,
          CoreInputNumberSpinbox.ACCESS_KEY_KEY);
      }
    }
    setBooleanProperty(bean, CoreInputNumberSpinbox.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreInputNumberSpinbox.LABEL_KEY, _label);
    setBooleanProperty(bean, CoreInputNumberSpinbox.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputNumberSpinbox.ONSELECT_KEY, _onselect);
    setProperty(bean, CoreInputNumberSpinbox.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreInputNumberSpinbox.CONTENT_STYLE_KEY, _contentStyle);
    setCharacterProperty(bean, CoreInputNumberSpinbox.ACCESS_KEY_KEY, _accessKey);
    setBooleanProperty(bean, CoreInputNumberSpinbox.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputNumberSpinbox.ONKEYDOWN_KEY, _onkeydown);
    setIntegerProperty(bean, CoreInputNumberSpinbox.STEP_SIZE_KEY, _stepSize);
  }

  @Override
  public void release()
  {
    super.release();
    _columns = null;
    _onmouseover = null;
    _styleClass = null;
    _showRequired = null;
    _minimum = null;
    _onblur = null;
    _onmousemove = null;
    _ondblclick = null;
    _partialTriggers = null;
    _maximum = null;
    _onfocus = null;
    _onkeypress = null;
    _onchange = null;
    _onclick = null;
    _onmouseup = null;
    _onkeyup = null;
    _inlineStyle = null;
    _shortDesc = null;
    _disabled = null;
    _labelAndAccessKey = null;
    _autoSubmit = null;
    _label = null;
    _simple = null;
    _onmousedown = null;
    _onmouseout = null;
    _onselect = null;
    _autoComplete = null;
    _contentStyle = null;
    _accessKey = null;
    _readOnly = null;
    _onkeydown = null;
    _stepSize = null;
  }
}
