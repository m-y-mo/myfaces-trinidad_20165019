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
package org.apache.myfaces.trinidad.component;

import javax.faces.component.ActionSource;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.LaunchEvent;
import org.apache.myfaces.trinidad.event.ReturnEvent;
import org.apache.myfaces.trinidad.event.ReturnListener;

/**
 *
 * selectInput is a base abstraction for
 *           components that allow both input and selection 
 *           from a list of possible values.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ActionEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values</td>
 * <td valign="top">Event delivered when the "action" of the component has been
invoked;  for example, by clicking on a button.  The action may result
in page navigation.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.ReturnEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values</td>
 * <td valign="top">Event delivered when the dialog has completed successfully.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ValueChangeEvent</code></td>
 * <td valign="top" nowrap>Process Validations<br>Apply Request Values</td>
 * <td valign="top">The valueChange event is delivered when the value
                       attribute is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXSelectInput extends UIXEditableValue
                            implements ActionSource
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXEditableValue.TYPE);
  static public final PropertyKey ACTION_KEY =
    TYPE.registerKey("action", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey ACTION_LISTENER_KEY =
    TYPE.registerKey("actionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey RETURN_LISTENER_KEY =
    TYPE.registerKey("returnListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectInput";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.SelectInput";

  /**
   * Construct an instance of the UIXSelectInput.
   */
  public UIXSelectInput()
  {
    super("org.apache.myfaces.trinidad.Text");
  }
  	

  /**
   * <p>Intercept <code>queueEvent</code> and mark the phaseId for any
   * ActionEvents to be <code>PhaseId.APPLY_REQUEST_VALUES</code>.
   */
  @Override
  public void queueEvent(FacesEvent e)
  {
    if (e instanceof ActionEvent)
    {
      // Always deliver ActionEvents immediately?
      //  if (isImmediate())
      {
        e.setPhaseId(PhaseId.ANY_PHASE);
      }
      /*
      else
      {
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
        }*/
    }

    super.queueEvent(e);
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    if (event instanceof ActionEvent)
    {
      RequestContext afContext = RequestContext.getCurrentInstance();
      afContext.getDialogService().setCurrentLaunchSource(this);

      try
      {
        // Perform standard superclass processing
        super.broadcast(event);

        // Notify the specified action listener method (if any),
        // and the default action listener
        broadcastToMethodBinding(event, getActionListener());

        FacesContext context = getFacesContext();
        ActionListener defaultActionListener =
          context.getApplication().getActionListener();
        if (defaultActionListener != null)
        {
          defaultActionListener.processAction((ActionEvent) event);
        }
      }
      finally
      {
        afContext.getDialogService().setCurrentLaunchSource(null);
      }
    }
    else if (event instanceof LaunchEvent)
    {
      // =-=AEW Support launch listeners on SelectInput?
      // super.broadcast(event);
      //
      // __broadcast(event, getLaunchListener());
      ((LaunchEvent) event).launchDialog(true);
    }
    else if (event instanceof ReturnEvent)
    {
      super.broadcast(event);

      broadcastToMethodBinding(event, getReturnListener());
      Object returnValue = ((ReturnEvent) event).getReturnValue();
      if (returnValue != null)
      {
        setSubmittedValue(returnValue);
      }

      // =-=AEW: always jump to render response???  Seems the safest
      // option, because we don't want to immediately update a model
      // or really perform any validation.
      getFacesContext().renderResponse();
    }
    else
    {
      super.broadcast(event);
    }
  }

  /**
   * Gets a reference to an action method sent by the commandButton, or the static outcome of an action
   *
   * @return  the new action value
   */
  final public MethodBinding getAction()
  {
    return (MethodBinding)getProperty(ACTION_KEY);
  }

  /**
   * Sets a reference to an action method sent by the commandButton, or the static outcome of an action
   * 
   * @param action  the new action value
   */
  final public void setAction(MethodBinding action)
  {
    setProperty(ACTION_KEY, (action));
  }

  /**
   * Gets a method reference to an action listener
   *
   * @return  the new actionListener value
   */
  final public MethodBinding getActionListener()
  {
    return (MethodBinding)getProperty(ACTION_LISTENER_KEY);
  }

  /**
   * Sets a method reference to an action listener
   * 
   * @param actionListener  the new actionListener value
   */
  final public void setActionListener(MethodBinding actionListener)
  {
    setProperty(ACTION_LISTENER_KEY, (actionListener));
  }

  /**
   * Gets a method reference to an return listener
   *
   * @return  the new returnListener value
   */
  final public MethodBinding getReturnListener()
  {
    return (MethodBinding)getProperty(RETURN_LISTENER_KEY);
  }

  /**
   * Sets a method reference to an return listener
   * 
   * @param returnListener  the new returnListener value
   */
  final public void setReturnListener(MethodBinding returnListener)
  {
    setProperty(RETURN_LISTENER_KEY, (returnListener));
  }

  /**
   * Adds a action listener.
   *
   * @param listener  the action listener to add
   */
  final public void addActionListener(
    ActionListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a action listener.
   *
   * @param listener  the action listener to remove
   */
  final public void removeActionListener(
    ActionListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached action listeners.
   *
   * @return  an array of attached action listeners.
   */
  final public ActionListener[] getActionListeners()
  {
    return (ActionListener[])getFacesListeners(ActionListener.class);
  }

  /**
   * Adds a return listener.
   *
   * @param listener  the return listener to add
   */
  final public void addReturnListener(
    ReturnListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a return listener.
   *
   * @param listener  the return listener to remove
   */
  final public void removeReturnListener(
    ReturnListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached return listeners.
   *
   * @return  an array of attached return listeners.
   */
  final public ReturnListener[] getReturnListeners()
  {
    return (ReturnListener[])getFacesListeners(ReturnListener.class);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXSelectInput.
   */
  protected UIXSelectInput(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectInput","org.apache.myfaces.trinidad.Text");
  }
}
