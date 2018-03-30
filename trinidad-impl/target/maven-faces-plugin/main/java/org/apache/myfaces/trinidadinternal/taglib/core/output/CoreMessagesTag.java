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

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.output.CoreMessages;
import org.apache.myfaces.trinidadinternal.taglib.UIXMessagesTag;

/**
 * Auto-generated tag class.
 */
public class CoreMessagesTag extends UIXMessagesTag
{

  /**
   * Construct an instance of the CoreMessagesTag.
   */
  public CoreMessagesTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreMessages";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Messages";
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

  private String _message;
  final public void setMessage(String message)
  {
    _message = message;
  }

  private String _text;
  final public void setText(String text)
  {
    _text = text;
  }

  private String _globalOnly;
  final public void setGlobalOnly(String globalOnly)
  {
    _globalOnly = globalOnly;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreMessages.STYLE_CLASS_KEY, _styleClass);
    setStringArrayProperty(bean, CoreMessages.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreMessages.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreMessages.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreMessages.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreMessages.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreMessages.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreMessages.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreMessages.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreMessages.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreMessages.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreMessages.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreMessages.TEXT_KEY, _text);
    setProperty(bean, CoreMessages.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreMessages.MESSAGE_KEY, _message);
    setProperty(bean, CoreMessages.ONDBLCLICK_KEY, _ondblclick);
    setBooleanProperty(bean, CoreMessages.GLOBAL_ONLY_KEY, _globalOnly);
  }

  @Override
  public void release()
  {
    super.release();
    _styleClass = null;
    _partialTriggers = null;
    _onmouseover = null;
    _inlineStyle = null;
    _onkeyup = null;
    _shortDesc = null;
    _onmousemove = null;
    _onmouseout = null;
    _onkeypress = null;
    _onmouseup = null;
    _onmousedown = null;
    _onkeydown = null;
    _text = null;
    _onclick = null;
    _message = null;
    _ondblclick = null;
    _globalOnly = null;
  }
}
