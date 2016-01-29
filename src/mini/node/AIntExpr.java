/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import mini.analysis.*;

@SuppressWarnings("nls")
public final class AIntExpr extends PExpr
{
    private TIntconst _intconst_;

    public AIntExpr()
    {
        // Constructor
    }

    public AIntExpr(
        @SuppressWarnings("hiding") TIntconst _intconst_)
    {
        // Constructor
        setIntconst(_intconst_);

    }

    @Override
    public Object clone()
    {
        return new AIntExpr(
            cloneNode(this._intconst_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntExpr(this);
    }

    public TIntconst getIntconst()
    {
        return this._intconst_;
    }

    public void setIntconst(TIntconst node)
    {
        if(this._intconst_ != null)
        {
            this._intconst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._intconst_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._intconst_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._intconst_ == child)
        {
            this._intconst_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._intconst_ == oldChild)
        {
            setIntconst((TIntconst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
