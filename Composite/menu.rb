# Composite class
class Menu < MenuComponent
  def initialize(name, description)
    @menuComponents = []
    @name = name
    @description = description
  end

  def add(menuComponent)
    @menuComponents << menuComponent
  end

  def remove(menuComponent)
    @menuComponents.delete_at(@menuComponents.index(menuComponent))
  end

  def getChild(num)
    return @menuComponents[num]
  end

  def getName
    return @name
  end

  def getDescription
    return @description
  end

  def printObject
    puts "\n" + self.getName + ', ' + self.getDescription
    puts '---------------------'

    @menuComponents.each do |object|
      object.printObject
    end
  end
end
