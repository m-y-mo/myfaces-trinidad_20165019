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
package org.apache.myfaces.trinidadinternal.taglib.html;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.html.HtmlBody;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class HtmlBodyTag extends UIXComponentTag
{

  /**
   * Construct an instance of the HtmlBodyTag.
   */
  public HtmlBodyTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlBody";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Body";
  }

  private String _firstClickPassed;
  final public void setFirstClickPassed(String firstClickPassed)
  {
    _firstClickPassed = firstClickPassed;
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

  private String _onload;
  final public void setOnload(String onload)
  {
    _onload = onload;
  }

  private String _onunload;
  final public void setOnunload(String onunload)
  {
    _onunload = onunload;
  }

  private String _initialFocusId;
  final public void setInitialFocusId(String initialFocusId)
  {
    _initialFocusId = initialFocusId;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, HtmlBody.ONCLICK_KEY, _onclick);
    setProperty(bean, HtmlBody.ONMOUSEMOVE_KEY, _onmousemove);
    setStringArrayProperty(bean, HtmlBody.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlBody.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlBody.ONLOAD_KEY, _onload);
    setProperty(bean, HtmlBody.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlBody.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, HtmlBody.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlBody.INITIAL_FOCUS_ID_KEY, _initialFocusId);
    setProperty(bean, HtmlBody.ONUNLOAD_KEY, _onunload);
    setProperty(bean, HtmlBody.ONMOUSEUP_KEY, _onmouseup);
    setBooleanProperty(bean, HtmlBody.FIRST_CLICK_PASSED_KEY, _firstClickPassed);
    setProperty(bean, HtmlBody.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, HtmlBody.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlBody.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, HtmlBody.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, HtmlBody.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlBody.ONMOUSEDOWN_KEY, _onmousedown);
  }

  @Override
  public void release()
  {
    super.release();
    _onclick = null;
    _onmousemove = null;
    _partialTriggers = null;
    _onkeydown = null;
    _onload = null;
    _ondblclick = null;
    _onkeyup = null;
    _inlineStyle = null;
    _initialFocusId = null;
    _onunload = null;
    _onmouseup = null;
    _firstClickPassed = null;
    _onmouseover = null;
    _styleClass = null;
    _onmouseout = null;
    _onkeypress = null;
    _shortDesc = null;
    _onmousedown = null;
  }
}
