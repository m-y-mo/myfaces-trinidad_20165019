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
import org.apache.myfaces.trinidad.component.html.HtmlFrame;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class HtmlFrameTag extends UIXComponentTag
{

  /**
   * Construct an instance of the HtmlFrameTag.
   */
  public HtmlFrameTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlFrame";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Frame";
  }

  private String _source;
  final public void setSource(String source)
  {
    _source = source;
  }

  private String _longDescURL;
  final public void setLongDescURL(String longDescURL)
  {
    _longDescURL = longDescURL;
  }

  private String _name;
  final public void setName(String name)
  {
    _name = name;
  }

  private String _width;
  final public void setWidth(String width)
  {
    _width = width;
  }

  private String _height;
  final public void setHeight(String height)
  {
    _height = height;
  }

  private String _marginWidth;
  final public void setMarginWidth(String marginWidth)
  {
    _marginWidth = marginWidth;
  }

  private String _marginHeight;
  final public void setMarginHeight(String marginHeight)
  {
    _marginHeight = marginHeight;
  }

  private String _scrolling;
  final public void setScrolling(String scrolling)
  {
    _scrolling = scrolling;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setIntegerProperty(bean, HtmlFrame.MARGIN_HEIGHT_KEY, _marginHeight);
    setIntegerProperty(bean, HtmlFrame.MARGIN_WIDTH_KEY, _marginWidth);
    setStringArrayProperty(bean, HtmlFrame.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlFrame.SOURCE_KEY, _source);
    setProperty(bean, HtmlFrame.LONG_DESC_URL_KEY, _longDescURL);
    setProperty(bean, HtmlFrame.NAME_KEY, _name);
    setProperty(bean, HtmlFrame.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlFrame.WIDTH_KEY, _width);
    setProperty(bean, HtmlFrame.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlFrame.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlFrame.HEIGHT_KEY, _height);
    setProperty(bean, HtmlFrame.SCROLLING_KEY, _scrolling);
  }

  @Override
  public void release()
  {
    super.release();
    _marginHeight = null;
    _marginWidth = null;
    _partialTriggers = null;
    _source = null;
    _longDescURL = null;
    _name = null;
    _styleClass = null;
    _width = null;
    _shortDesc = null;
    _inlineStyle = null;
    _height = null;
    _scrolling = null;
  }
}
