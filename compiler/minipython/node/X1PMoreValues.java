/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class X1PMoreValues extends XPMoreValues
{
    private XPMoreValues _xPMoreValues_;
    private PMoreValues _pMoreValues_;

    public X1PMoreValues()
    {
    }

    public X1PMoreValues(
        XPMoreValues _xPMoreValues_,
        PMoreValues _pMoreValues_)
    {
        setXPMoreValues(_xPMoreValues_);
        setPMoreValues(_pMoreValues_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPMoreValues getXPMoreValues()
    {
        return _xPMoreValues_;
    }

    public void setXPMoreValues(XPMoreValues node)
    {
        if(_xPMoreValues_ != null)
        {
            _xPMoreValues_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPMoreValues_ = node;
    }

    public PMoreValues getPMoreValues()
    {
        return _pMoreValues_;
    }

    public void setPMoreValues(PMoreValues node)
    {
        if(_pMoreValues_ != null)
        {
            _pMoreValues_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pMoreValues_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPMoreValues_ == child)
        {
            _xPMoreValues_ = null;
        }

        if(_pMoreValues_ == child)
        {
            _pMoreValues_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPMoreValues_) +
            toString(_pMoreValues_);
    }
}