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
package org.apache.myfaces.trinidadinternal.taglib.core.output;

import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.output.CoreOutputLabel;
import org.apache.myfaces.trinidadinternal.taglib.UIXOutputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreOutputLabelTag extends UIXOutputTag
{

  /**
   * Construct an instance of the CoreOutputLabelTag.
   */
  public CoreOutputLabelTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreOutputLabel";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Label";
  }

  private String _accessKey;
  final public void setAccessKey(String accessKey)
  {
    _accessKey = accessKey;
  }

  private String _showRequired;
  final public void setShowRequired(String showRequired)
  {
    _showRequired = showRequired;
  }

  private String _valueAndAccessKey;
  final public void setValueAndAccessKey(String valueAndAccessKey)
  {
    _valueAndAccessKey = valueAndAccessKey;
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
    setProperty(bean, CoreOutputLabel.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreOutputLabel.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreOutputLabel.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreOutputLabel.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreOutputLabel.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreOutputLabel.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreOutputLabel.INLINE_STYLE_KEY, _inlineStyle);
    setCharacterProperty(bean, CoreOutputLabel.ACCESS_KEY_KEY, _accessKey);
    setStringArrayProperty(bean, CoreOutputLabel.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreOutputLabel.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreOutputLabel.ONMOUSEOUT_KEY, _onmouseout);
    if (_valueAndAccessKey != null)
    {
      if (isValueReference(_valueAndAccessKey))
      {
        ValueBinding vb = createValueBinding(_valueAndAccessKey);
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          vb,
          CoreOutputLabel.VALUE_KEY,
          CoreOutputLabel.ACCESS_KEY_KEY);
      }
      else
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _valueAndAccessKey,
          CoreOutputLabel.VALUE_KEY,
          CoreOutputLabel.ACCESS_KEY_KEY);
      }
    }
    setBooleanProperty(bean, CoreOutputLabel.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreOutputLabel.FOR_KEY, _for);
    setProperty(bean, CoreOutputLabel.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreOutputLabel.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreOutputLabel.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreOutputLabel.ONMOUSEDOWN_KEY, _onmousedown);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeydown = null;
    _onkeyup = null;
    _onmousemove = null;
    _onkeypress = null;
    _styleClass = null;
    _onclick = null;
    _inlineStyle = null;
    _accessKey = null;
    _partialTriggers = null;
    _ondblclick = null;
    _onmouseout = null;
    _valueAndAccessKey = null;
    _showRequired = null;
    _for = null;
    _onmouseover = null;
    _shortDesc = null;
    _onmouseup = null;
    _onmousedown = null;
  }
}
