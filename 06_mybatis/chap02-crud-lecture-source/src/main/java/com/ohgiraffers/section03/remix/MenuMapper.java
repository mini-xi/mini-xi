package com.ohgiraffers.section03.remix;

import java.util.List;

public interface MenuMapper {
    List<MenuDTO> selectAllMenus();

    List<MenuDTO> findMenuByMenuCode(int menuCode);

    MenuDTO selectMenu(int menuCode);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int menuCode);
}
