package BUS.Interfaces;

import BUS.Interfaces.common.ICrudBUS;
import BUS.Interfaces.common.ISearchableBUS;
import DTO.CT_PhanQuyenDTO;
import DTO.CT_PhieuNhapDTO;

import java.util.ArrayList;

public interface ICT_PhanQuyenBUS extends ISearchableBUS<CT_PhanQuyenDTO>, ICrudBUS<CT_PhanQuyenDTO> {
}
