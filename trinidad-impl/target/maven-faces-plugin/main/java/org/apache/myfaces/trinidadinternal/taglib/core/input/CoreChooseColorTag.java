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

import java.text.ParseException;
import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreChooseColor;
import org.apache.myfaces.trinidadinternal.taglib.UIXChooseTag;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**
 * Auto-generated tag class.
 */
public class CoreChooseColorTag extends UIXChooseTag
{

  /**
   * Construct an instance of the CoreChooseColorTag.
   */
  public CoreChooseColorTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreChooseColor";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Color";
  }

  private String _colorData;
  final public void setColorData(String colorData)
  {
    _colorData = colorData;
  }

  private String _customColorData;
  final public void setCustomColorData(String customColorData)
  {
    _customColorData = customColorData;
  }

  private String _width;
  final public void setWidth(String width)
  {
    _width = width;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setIntegerProperty(bean, CoreChooseColor.WIDTH_KEY, _width);
    setProperty(bean, CoreChooseColor.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreChooseColor.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreChooseColor.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreChooseColor.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreChooseColor.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreChooseColor.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreChooseColor.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreChooseColor.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreChooseColor.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreChooseColor.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreChooseColor.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreChooseColor.ONMOUSEOVER_KEY, _onmouseover);
    if (_colorData != null)
    {
      if (isValueReference(_colorData))
      {
        ValueBinding vb = createValueBinding(_colorData);
        bean.setValueBinding(CoreChooseColor.COLOR_DATA_KEY, vb);
      }
      else
      {
        try
        {
          bean.setProperty(CoreChooseColor.COLOR_DATA_KEY,
                           TagUtils.getColorList(_colorData));
        }
        catch (ParseException pe)
        {
          setValidationError(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    setStringArrayProperty(bean, CoreChooseColor.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreChooseColor.ONMOUSEOUT_KEY, _onmouseout);
    if (_customColorData != null)
    {
      if (isValueReference(_customColorData))
      {
        ValueBinding vb = createValueBinding(_customColorData);
        bean.setValueBinding(CoreChooseColor.CUSTOM_COLOR_DATA_KEY, vb);
      }
      else
      {
        try
        {
          bean.setProperty(CoreChooseColor.CUSTOM_COLOR_DATA_KEY,
                           TagUtils.getColorList(_customColorData));
        }
        catch (ParseException pe)
        {
          setValidationError(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _width = null;
    _styleClass = null;
    _onclick = null;
    _ondblclick = null;
    _onmouseup = null;
    _onkeydown = null;
    _onkeyup = null;
    _onmousemove = null;
    _shortDesc = null;
    _onkeypress = null;
    _onmousedown = null;
    _inlineStyle = null;
    _onmouseover = null;
    _colorData = null;
    _partialTriggers = null;
    _onmouseout = null;
    _customColorData = null;
  }
}
