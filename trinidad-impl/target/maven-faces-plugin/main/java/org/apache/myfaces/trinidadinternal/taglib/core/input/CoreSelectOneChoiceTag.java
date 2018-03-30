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
import org.apache.myfaces.trinidad.component.core.input.CoreSelectOneChoice;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectOneTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectOneChoiceTag extends UIXSelectOneTag
{

  /**
   * Construct an instance of the CoreSelectOneChoiceTag.
   */
  public CoreSelectOneChoiceTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectOneChoice";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Choice";
  }

  private String _contentStyle;
  final public void setContentStyle(String contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private String _unselectedLabel;
  final public void setUnselectedLabel(String unselectedLabel)
  {
    _unselectedLabel = unselectedLabel;
  }

  private String _labelAndAccessKey;
  final public void setLabelAndAccessKey(String labelAndAccessKey)
  {
    _labelAndAccessKey = labelAndAccessKey;
  }

  private String _valuePassThru;
  final public void setValuePassThru(String valuePassThru)
  {
    _valuePassThru = valuePassThru;
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

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
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
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreSelectOneChoice.LABEL_KEY,
          CoreSelectOneChoice.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreSelectOneChoice.LABEL_KEY,
          CoreSelectOneChoice.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectOneChoice.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectOneChoice.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectOneChoice.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectOneChoice.UNSELECTED_LABEL_KEY, _unselectedLabel);
    setProperty(bean, CoreSelectOneChoice.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectOneChoice.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectOneChoice.ONCHANGE_KEY, _onchange);
    setBooleanProperty(bean, CoreSelectOneChoice.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreSelectOneChoice.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectOneChoice.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectOneChoice.LABEL_KEY, _label);
    setProperty(bean, CoreSelectOneChoice.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectOneChoice.ONMOUSEMOVE_KEY, _onmousemove);
    setBooleanProperty(bean, CoreSelectOneChoice.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreSelectOneChoice.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectOneChoice.ONKEYDOWN_KEY, _onkeydown);
    setStringArrayProperty(bean, CoreSelectOneChoice.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectOneChoice.ONBLUR_KEY, _onblur);
    setBooleanProperty(bean, CoreSelectOneChoice.DISABLED_KEY, _disabled);
    setProperty(bean, CoreSelectOneChoice.ONFOCUS_KEY, _onfocus);
    setBooleanProperty(bean, CoreSelectOneChoice.VALUE_PASS_THRU_KEY, _valuePassThru);
    setProperty(bean, CoreSelectOneChoice.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectOneChoice.ONMOUSEUP_KEY, _onmouseup);
    setCharacterProperty(bean, CoreSelectOneChoice.ACCESS_KEY_KEY, _accessKey);
    setBooleanProperty(bean, CoreSelectOneChoice.READ_ONLY_KEY, _readOnly);
    setBooleanProperty(bean, CoreSelectOneChoice.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectOneChoice.ONMOUSEDOWN_KEY, _onmousedown);
  }

  @Override
  public void release()
  {
    super.release();
    _labelAndAccessKey = null;
    _onkeypress = null;
    _onmouseout = null;
    _shortDesc = null;
    _unselectedLabel = null;
    _styleClass = null;
    _contentStyle = null;
    _onchange = null;
    _autoSubmit = null;
    _inlineStyle = null;
    _onkeyup = null;
    _label = null;
    _onclick = null;
    _onmousemove = null;
    _showRequired = null;
    _onmouseover = null;
    _onkeydown = null;
    _partialTriggers = null;
    _onblur = null;
    _disabled = null;
    _onfocus = null;
    _valuePassThru = null;
    _ondblclick = null;
    _onmouseup = null;
    _accessKey = null;
    _readOnly = null;
    _simple = null;
    _onmousedown = null;
  }
}
