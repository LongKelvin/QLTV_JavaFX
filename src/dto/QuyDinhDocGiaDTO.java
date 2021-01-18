package dto;

import java.time.*;

public class QuyDinhDocGiaDTO
{
	private String maqd;
	private int tuoitoithieu;
	private int tuoitoida;
	private int thoihanthe;
	private LocalDateTime ngayra = LocalDateTime.MIN;
	private LocalDateTime ngayketthuc = LocalDateTime.MIN;

	public final int getTuoitoithieu()
	{
		return tuoitoithieu;
	}
	public final void setTuoitoithieu(int value)
	{
		tuoitoithieu = value;
	}
	public final int getTuoitoida()
	{
		return tuoitoida;
	}
	public final void setTuoitoida(int value)
	{
		tuoitoida = value;
	}
	public final int getThoihanthe()
	{
		return thoihanthe;
	}
	public final void setThoihanthe(int value)
	{
		thoihanthe = value;
	}
	public final LocalDateTime getNgayra()
	{
		return ngayra;
	}
	public final void setNgayra(LocalDateTime value)
	{
		ngayra = value;
	}
	public final LocalDateTime getNgayketthuc()
	{
		return ngayketthuc;
	}
	public final void setNgayketthuc(LocalDateTime value)
	{
		ngayketthuc = value;
	}
	public final String getMaqd()
	{
		return maqd;
	}
	public final void setMaqd(String value)
	{
		maqd = value;
	}
}