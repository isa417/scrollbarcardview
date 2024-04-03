package com.example.scrollbarcardview;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EspacioItemDecoration extends RecyclerView.ItemDecoration {
    private final int espacioEntreElementos;

    public EspacioItemDecoration(int espacio) {
        this.espacioEntreElementos = espacio;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
            outRect.right = espacioEntreElementos;
        }
    }
}

