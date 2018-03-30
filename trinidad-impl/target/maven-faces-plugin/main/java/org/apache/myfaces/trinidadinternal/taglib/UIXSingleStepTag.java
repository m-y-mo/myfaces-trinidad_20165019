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
package org.apache.myfaces.trinidadinternal.taglib;

import javax.faces.el.MethodBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXSingleStep;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXSingleStepTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXSingleStepTag.
   */
  public UIXSingleStepTag()
  {
  }

  private String _selectedStep;
  final public void setSelectedStep(String selectedStep)
  {
    _selectedStep = selectedStep;
  }

  private String _maxStep;
  final public void setMaxStep(String maxStep)
  {
    _maxStep = maxStep;
  }

  private String _previousActionListener;
  final public void setPreviousActionListener(String previousActionListener)
  {
    _previousActionListener = previousActionListener;
  }

  private String _nextActionListener;
  final public void setNextActionListener(String nextActionListener)
  {
    _nextActionListener = nextActionListener;
  }

  private String _nextAction;
  final public void setNextAction(String nextAction)
  {
    _nextAction = nextAction;
  }

  private String _previousAction;
  final public void setPreviousAction(String previousAction)
  {
    _previousAction = previousAction;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setIntegerProperty(bean, UIXSingleStep.MAX_STEP_KEY, _maxStep);
    setIntegerProperty(bean, UIXSingleStep.SELECTED_STEP_KEY, _selectedStep);
    if (_nextAction != null)
    {
      MethodBinding mb;
      if (isValueReference(_nextAction))
        mb = createMethodBinding(_nextAction, new Class[0]);
      else
        mb = new org.apache.myfaces.trinidadinternal.taglib.ConstantMethodBinding(_nextAction);
      bean.setProperty(UIXSingleStep.NEXT_ACTION_KEY, mb);
    }
    if (_previousActionListener != null)
    {
      MethodBinding mb = createMethodBinding(_previousActionListener, new Class[]{javax.faces.event.ActionEvent.class,});
      bean.setProperty(UIXSingleStep.PREVIOUS_ACTION_LISTENER_KEY, mb);
    }
    if (_nextActionListener != null)
    {
      MethodBinding mb = createMethodBinding(_nextActionListener, new Class[]{javax.faces.event.ActionEvent.class,});
      bean.setProperty(UIXSingleStep.NEXT_ACTION_LISTENER_KEY, mb);
    }
    if (_previousAction != null)
    {
      MethodBinding mb;
      if (isValueReference(_previousAction))
        mb = createMethodBinding(_previousAction, new Class[0]);
      else
        mb = new org.apache.myfaces.trinidadinternal.taglib.ConstantMethodBinding(_previousAction);
      bean.setProperty(UIXSingleStep.PREVIOUS_ACTION_KEY, mb);
    }
  }

  @Override
  public void release()
  {
    super.release();
    _maxStep = null;
    _selectedStep = null;
    _nextAction = null;
    _previousActionListener = null;
    _nextActionListener = null;
    _previousAction = null;
  }
}
