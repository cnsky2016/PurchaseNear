// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `ResetService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.purchasenear.service.reset.Reset;

public abstract class Callback_ResetService_flashsales extends Ice.TwowayCallback
{
    public abstract void response(ResetInfo __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        ResetServicePrx __proxy = (ResetServicePrx)__result.getProxy();
        ResetInfo __ret = null;
        try
        {
            __ret = __proxy.end_flashsales(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
