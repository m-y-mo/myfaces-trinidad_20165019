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
package org.apache.myfaces.trinidadinternal.taglib.core.data;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.data.CoreSelectRangeChoiceBar;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectRangeTag;

/**
 * Auto-generated tag class.
 */
public class CoreSelectRangeChoiceBarTag extends UIXSelectRangeTag
{

  /**
   * Construct an instance of the CoreSelectRangeChoiceBarTag.
   */
  public CoreSelectRangeChoiceBarTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectRangeChoiceBar";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.ChoiceBar";
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
    setProperty(bean, CoreSelectRangeChoiceBar.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectRangeChoiceBar.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectRangeChoiceBar.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectRangeChoiceBar.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectRangeChoiceBar.ONKEYUP_KEY, _onkeyup);
    setStringArrayProperty(bean, CoreSelectRangeChoiceBar.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreSelectRangeChoiceBar.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectRangeChoiceBar.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectRangeChoiceBar.ONCLICK_KEY, _onclick);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeydown = null;
    _shortDesc = null;
    _styleClass = null;
    _onmouseover = null;
    _onkeypress = null;
    _onmousedown = null;
    _onkeyup = null;
    _partialTriggers = null;
    _onmouseout = null;
    _onmousemove = null;
    _ondblclick = null;
    _onmouseup = null;
    _inlineStyle = null;
    _onclick = null;
  }
}
