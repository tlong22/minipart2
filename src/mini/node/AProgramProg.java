/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import java.util.*;
import mini.analysis.*;

@SuppressWarnings("nls")
public final class AProgramProg extends PProg
{
    private final LinkedList<PDecl> _declList_ = new LinkedList<PDecl>();
    private final LinkedList<PStmt> _stmtList_ = new LinkedList<PStmt>();

    public AProgramProg()
    {
        // Constructor
    }

    public AProgramProg(
        @SuppressWarnings("hiding") List<?> _declList_,
        @SuppressWarnings("hiding") List<?> _stmtList_)
    {
        // Constructor
        setDeclList(_declList_);

        setStmtList(_stmtList_);

    }

    @Override
    public Object clone()
    {
        return new AProgramProg(
            cloneList(this._declList_),
            cloneList(this._stmtList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramProg(this);
    }

    public LinkedList<PDecl> getDeclList()
    {
        return this._declList_;
    }

    public void setDeclList(List<?> list)
    {
        for(PDecl e : this._declList_)
        {
            e.parent(null);
        }
        this._declList_.clear();

        for(Object obj_e : list)
        {
            PDecl e = (PDecl) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declList_.add(e);
        }
    }

    public LinkedList<PStmt> getStmtList()
    {
        return this._stmtList_;
    }

    public void setStmtList(List<?> list)
    {
        for(PStmt e : this._stmtList_)
        {
            e.parent(null);
        }
        this._stmtList_.clear();

        for(Object obj_e : list)
        {
            PStmt e = (PStmt) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._stmtList_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declList_)
            + toString(this._stmtList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declList_.remove(child))
        {
            return;
        }

        if(this._stmtList_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecl> i = this._declList_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PStmt> i = this._stmtList_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStmt) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
