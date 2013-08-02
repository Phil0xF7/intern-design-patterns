# Leaf node class
class MenuItem < MenuComponent
  def initialize(name, description, vegetarian, price)
    @name = name
    @description = description
    @vegetarian = vegetarian
    @price = price
  end

  def getName
    return @name
  end

  def getDescription
    return @description
  end

  def getPrice
    return @price
  end

  def isVegetarian
    return @vegetarian
  end

  def printObject
    print ' ' + self.getName
    if (self.isVegetarian)
      print '(v)'
    end
    puts ', ' + self.getPrice.to_s
    puts '    -- ' + self.getDescription
  end
end
