package com.romanmufid.pengembalian.vo;

import com.romanmufid.pengembalian.entity.Pengembalian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Acer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Peminjaman peminjaman;
    private Pengembalian pengembalian;
}
