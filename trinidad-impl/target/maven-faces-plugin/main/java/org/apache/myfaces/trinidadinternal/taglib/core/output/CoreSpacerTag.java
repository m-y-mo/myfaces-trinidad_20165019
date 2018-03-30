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
import org.apache.myfaces.trinidad.component.core.output.CoreSpacer;
import org.apache.myfaces.trinidadinternal.taglib.UIXObjectTag;

/**
 * Auto-generated tag class.
 */
public class CoreSpacerTag extends UIXObjectTag
{

  /**
   * Construct an instance of the CoreSpacerTag.
   */
  public CoreSpacerTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSpacer";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Spacer";
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setStringArrayProperty(bean, CoreSpacer.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSpacer.WIDTH_KEY, _width);
    setProperty(bean, CoreSpacer.HEIGHT_KEY, _height);
    setProperty(bean, CoreSpacer.SHORT_DESC_KEY, _shortDesc);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _width = null;
    _height = null;
    _shortDesc = null;
  }
}
