require_relative "menu_component"
require_relative "menu_item"
require_relative "menu"

# client
class Waitress
  def initialize(allMenus)
    @allMenus = allMenus
  end

  def printMenu
    @allMenus.printObject
  end
end

class MenuTestDrive
  def self.main
    # create entire menu tree structure

    #####
    # create menus
    @pancakeHouseMenu = Menu.new("PANCAKE HOUSE MENU", "Breakfast")
    @dinerMenu = Menu.new("DINER MENU", "Lunch")
    @cafeMenu = Menu.new("CAFE MENU", "Dinner")
    @dessertMenu = Menu.new("DESSERT MENU", "Dessert of course!")

    @allMenus = Menu.new("ALL MENUS", "All menus combined")

    #####
    # add menus to parent menu
    @allMenus.add(@pancakeHouseMenu)
    @allMenus.add(@dinerMenu)
    @allMenus.add(@cafeMenu)

    #####
    # add menu items to each menu
    @pancakeHouseMenu.add(MenuItem.new("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99))
    @pancakeHouseMenu.add(MenuItem.new("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99)) 

    @dinerMenu.add(MenuItem.new("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89))
    @dinerMenu.add(MenuItem.new("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99))

    #####
    # add dessert sub-menu to the diner menu
    @dinerMenu.add(@dessertMenu)

    @dessertMenu.add(MenuItem.new("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59))
    @dessertMenu.add(MenuItem.new("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99))

    @cafeMenu.add(MenuItem.new("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99))
    @cafeMenu.add(MenuItem.new("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69))

    #####
    # pass entre menu to the client
    @waitress = Waitress.new(@allMenus)
    @waitress.printMenu
  end
end

MenuTestDrive.main
