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
import org.apache.myfaces.trinidad.component.html.HtmlFrameBorderLayout;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
public class HtmlFrameBorderLayoutTag extends UIXComponentTag
{

  /**
   * Construct an instance of the HtmlFrameBorderLayoutTag.
   */
  public HtmlFrameBorderLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlFrameBorderLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.FrameBorderLayout";
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

  private String _frameSpacing;
  final public void setFrameSpacing(String frameSpacing)
  {
    _frameSpacing = frameSpacing;
  }

  private String _borderWidth;
  final public void setBorderWidth(String borderWidth)
  {
    _borderWidth = borderWidth;
  }

  private String _frameBorderWidth;
  final public void setFrameBorderWidth(String frameBorderWidth)
  {
    _frameBorderWidth = frameBorderWidth;
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
    setIntegerProperty(bean, HtmlFrameBorderLayout.FRAME_SPACING_KEY, _frameSpacing);
    setIntegerProperty(bean, HtmlFrameBorderLayout.FRAME_BORDER_WIDTH_KEY, _frameBorderWidth);
    setIntegerProperty(bean, HtmlFrameBorderLayout.BORDER_WIDTH_KEY, _borderWidth);
    setProperty(bean, HtmlFrameBorderLayout.ONUNLOAD_KEY, _onunload);
    setProperty(bean, HtmlFrameBorderLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlFrameBorderLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlFrameBorderLayout.WIDTH_KEY, _width);
    setProperty(bean, HtmlFrameBorderLayout.ONLOAD_KEY, _onload);
    setStringArrayProperty(bean, HtmlFrameBorderLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlFrameBorderLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlFrameBorderLayout.HEIGHT_KEY, _height);
  }

  @Override
  public void release()
  {
    super.release();
    _frameSpacing = null;
    _frameBorderWidth = null;
    _borderWidth = null;
    _onunload = null;
    _styleClass = null;
    _shortDesc = null;
    _width = null;
    _onload = null;
    _partialTriggers = null;
    _inlineStyle = null;
    _height = null;
  }
}
