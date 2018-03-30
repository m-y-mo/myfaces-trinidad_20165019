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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelLabelAndMessage;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CorePanelLabelAndMessageTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelLabelAndMessageTag.
   */
  public CorePanelLabelAndMessageTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelLabelAndMessage";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.LabelAndMessage";
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

  private String _showRequired;
  final public void setShowRequired(String showRequired)
  {
    _showRequired = showRequired;
  }

  private String _label;
  final public void setLabel(String label)
  {
    _label = label;
  }

  private String _labelStyle;
  final public void setLabelStyle(String labelStyle)
  {
    _labelStyle = labelStyle;
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

  private String _for;
  final public void setFor(String forParam)
  {
    _for = forParam;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelLabelAndMessage.STYLE_CLASS_KEY, _styleClass);
    setBooleanProperty(bean, CorePanelLabelAndMessage.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelLabelAndMessage.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelLabelAndMessage.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelLabelAndMessage.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelLabelAndMessage.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelLabelAndMessage.LABEL_STYLE_KEY, _labelStyle);
    setStringArrayProperty(bean, CorePanelLabelAndMessage.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelLabelAndMessage.ONKEYUP_KEY, _onkeyup);
    if (_labelAndAccessKey != null)
    {
      if (isValueReference(_labelAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_labelAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CorePanelLabelAndMessage.LABEL_KEY,
          CorePanelLabelAndMessage.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CorePanelLabelAndMessage.LABEL_KEY,
          CorePanelLabelAndMessage.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CorePanelLabelAndMessage.LABEL_KEY, _label);
    setProperty(bean, CorePanelLabelAndMessage.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelLabelAndMessage.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEMOVE_KEY, _onmousemove);
    setCharacterProperty(bean, CorePanelLabelAndMessage.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CorePanelLabelAndMessage.FOR_KEY, _for);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseout = null;
    _styleClass = null;
    _showRequired = null;
    _onmouseup = null;
    _onmouseover = null;
    _onclick = null;
    _onmousedown = null;
    _onkeydown = null;
    _inlineStyle = null;
    _shortDesc = null;
    _labelStyle = null;
    _partialTriggers = null;
    _onkeyup = null;
    _labelAndAccessKey = null;
    _label = null;
    _onkeypress = null;
    _ondblclick = null;
    _onmousemove = null;
    _accessKey = null;
    _for = null;
  }
}
