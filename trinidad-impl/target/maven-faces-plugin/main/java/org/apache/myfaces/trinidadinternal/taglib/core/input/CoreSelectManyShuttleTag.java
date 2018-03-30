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

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreSelectManyShuttle;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectManyTag;

/**
 * Auto-generated tag class.
 */
public class CoreSelectManyShuttleTag extends UIXSelectManyTag
{

  /**
   * Construct an instance of the CoreSelectManyShuttleTag.
   */
  public CoreSelectManyShuttleTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectManyShuttle";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Shuttle";
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

  private String _size;
  final public void setSize(String size)
  {
    _size = size;
  }

  private String _leadingHeader;
  final public void setLeadingHeader(String leadingHeader)
  {
    _leadingHeader = leadingHeader;
  }

  private String _trailingHeader;
  final public void setTrailingHeader(String trailingHeader)
  {
    _trailingHeader = trailingHeader;
  }

  private String _leadingDescShown;
  final public void setLeadingDescShown(String leadingDescShown)
  {
    _leadingDescShown = leadingDescShown;
  }

  private String _trailingDescShown;
  final public void setTrailingDescShown(String trailingDescShown)
  {
    _trailingDescShown = trailingDescShown;
  }

  private String _label;
  final public void setLabel(String label)
  {
    _label = label;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreSelectManyShuttle.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectManyShuttle.ONKEYDOWN_KEY, _onkeydown);
    setIntegerProperty(bean, CoreSelectManyShuttle.SIZE_KEY, _size);
    setProperty(bean, CoreSelectManyShuttle.LABEL_KEY, _label);
    setBooleanProperty(bean, CoreSelectManyShuttle.DISABLED_KEY, _disabled);
    setBooleanProperty(bean, CoreSelectManyShuttle.TRAILING_DESC_SHOWN_KEY, _trailingDescShown);
    setProperty(bean, CoreSelectManyShuttle.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectManyShuttle.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreSelectManyShuttle.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectManyShuttle.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectManyShuttle.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectManyShuttle.TRAILING_HEADER_KEY, _trailingHeader);
    setProperty(bean, CoreSelectManyShuttle.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectManyShuttle.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectManyShuttle.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectManyShuttle.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectManyShuttle.ONMOUSEUP_KEY, _onmouseup);
    setBooleanProperty(bean, CoreSelectManyShuttle.LEADING_DESC_SHOWN_KEY, _leadingDescShown);
    setProperty(bean, CoreSelectManyShuttle.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreSelectManyShuttle.LEADING_HEADER_KEY, _leadingHeader);
    setProperty(bean, CoreSelectManyShuttle.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectManyShuttle.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CoreSelectManyShuttle.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setBooleanProperty(bean, CoreSelectManyShuttle.READ_ONLY_KEY, _readOnly);
    setBooleanProperty(bean, CoreSelectManyShuttle.VALUE_PASS_THRU_KEY, _valuePassThru);
    setProperty(bean, CoreSelectManyShuttle.ONKEYUP_KEY, _onkeyup);
  }

  @Override
  public void release()
  {
    super.release();
    _onchange = null;
    _onkeydown = null;
    _size = null;
    _label = null;
    _disabled = null;
    _trailingDescShown = null;
    _onblur = null;
    _onfocus = null;
    _onmouseover = null;
    _onmouseout = null;
    _ondblclick = null;
    _trailingHeader = null;
    _onkeypress = null;
    _styleClass = null;
    _onmousedown = null;
    _inlineStyle = null;
    _onmouseup = null;
    _leadingDescShown = null;
    _onmousemove = null;
    _leadingHeader = null;
    _onclick = null;
    _shortDesc = null;
    _partialTriggers = null;
    _readOnly = null;
    _valuePassThru = null;
    _onkeyup = null;
  }
}
